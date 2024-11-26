const $mainSeat = document.getElementById("main-seat");
let t = 0;
let m = 0;
const $seatContent = $mainSeat.querySelector(':scope > .control-bar > .space > .seat-content');
const $seatCommon = document.createElement('span');
$seatCommon.className = 'seat-common';
$seatContent.appendChild($seatCommon);

const $theaterContent = $mainSeat.querySelector(':scope > .control-bar > .space > .theater-content');
const $seatHuman = document.createElement('span');
$seatHuman.className = 'seat-human';
$theaterContent.appendChild($seatHuman);



const adults = document.querySelectorAll('.radio');
const seats = [];



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
                // else if (seat.classList.contains('selected-seat')) {
                //         t++;
                //         seat.classList.remove('selected-seat');
                //         const index = selectedSeats.indexOf(seat.id);
                //         if (index !== -1) {
                //             selectedSeats.splice(index, 1);
                //         }
                //         $seatNumber.textContent = `${selectedSeats.join(', ')}`;
                }
            }
        }
    })
});
let selectedHuman = [];

adults.forEach((radio) => {
    radio.addEventListener('change', () => {
        t = parseInt(radio.value);
        m = parseInt(radio.value);
        if (radio.value !== '0') {
            $seatCommon.textContent = '일반석';
            selectedHuman.push(`일반 ${(radio.value)}명`);
            $seatHuman.textContent = `${selectedHuman.join(', ')}`;


        } else{
            $seatCommon.textContent = ''
            selectedHuman.push(`일반 ${(radio.value)}명`);
            $seatHuman.textContent = `${selectedHuman.join(', ')}`;
        }



        seats.forEach((seat) => {
            seat.classList.remove('selected-seat');
            const index = selectedHuman.indexOf(`일반 ${(radio.value)}명`);
            if (index !== -1) {
                selectedHuman.splice(index, 1);
            }
        });
        selectedSeats = [];
        $seatNumber.textContent = '';

    });
});