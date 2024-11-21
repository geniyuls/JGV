const $main = document.getElementById("main");
let t = 0;
let m = 0;
const $seatContent = $main.querySelector(':scope > .control-bar > .space > .seat-content');
const $seatCommon = document.createElement('span');
$seatCommon.className = 'seat-common';
$seatContent.appendChild($seatCommon);


const adults = document.querySelectorAll('.radio');
const seats = [];

adults.forEach((radio) => {
    radio.addEventListener('change', () => {
        t = parseInt(radio.value);
        m = parseInt(radio.value);
        $seatCommon.textContent = '일반석';

    });
});

const table = document.createElement('table');
table.className = 'table';

const rows = ['A', 'B', 'C', 'D', 'E'];
rows.forEach(row => {
    const tr = document.createElement('tr'); // 행 생성
    const th = document.createElement('th');
    th.textContent = row;
    tr.appendChild(th);
    for (let i = 1; i <= 8; i++) {
        const td = document.createElement('td');
        td.id = `${row}${i}`;
        td.className = 'seat';
        td.textContent = i;
        tr.appendChild(td);
        seats.push(td);
    }
    table.appendChild(tr);
});
const screen = document.querySelector("#screen");
if (screen) {
    screen.appendChild(table);
}

const $seatNumber = document.createElement('span');
$seatNumber.className = 'seat-number';
$seatContent.appendChild($seatNumber);
let selectedSeats = [];

seats.forEach((seat) => {
    seat.addEventListener('click', () => {
        if (t > 0 && !seat.classList.contains('selected-seat')) {
            t--;
            seat.classList.add('selected-seat');
            selectedSeats.push(seat.id);
            $seatNumber.textContent = `${selectedSeats.join(', ')}`;
        } else {
            for (j = 0; j < m; j++) {
                if (seat.id == selectedSeats[j]) {
                    t++;
                    seat.classList.remove('selected-seat');
                    const index = selectedSeats.indexOf(seat.id);
                    if (index !== -1) {
                        selectedSeats.splice(index, 1);
                    }
                    $seatNumber.textContent = `${selectedSeats.join(', ')}`;
                }
            }
        }
    })
});