let t = 0; // 선택된 인원 수
const adults = document.querySelectorAll('.radio'); // 인원 수 라디오 버튼
const seats = []; // 좌석들을 저장할 배열

// 라디오 버튼에서 선택된 인원 수 업데이트
adults.forEach((radio) => {
    radio.addEventListener('change', () => {
        t = parseInt(radio.value); // t 값을 선택된 값으로 설정
        console.log(`Selected number of people: ${t}`);
    });
});

// 테이블 생성
const table = document.createElement('table');
table.className = 'table';

// 행의 알파벳(A~E)
const rows = ['A', 'B', 'C', 'D', 'E'];

// 각 행에 좌석 추가
rows.forEach(row => {
    const tr = document.createElement('tr'); // 행 생성

    // 첫 번째 열: 행 이름 (A, B, ...)
    const th = document.createElement('th');
    th.textContent = row; // 행 이름 설정
    tr.appendChild(th);

    // 좌석(td) 추가
    for (let i = 1; i <= 8; i++) {
        const td = document.createElement('td');
        td.id = `${row}${i}`; // ID 설정 (예: A1, B2)
        td.className = 'seat'; // 클래스 설정
        td.textContent = i; // 좌석 번호 텍스트 설정
        tr.appendChild(td);
        seats.push(td); // 좌석을 배열에 추가
    }

    // 행을 테이블에 추가
    table.appendChild(tr);
});

// 테이블을 원하는 위치에 추가
const screen = document.querySelector("#screen");
if (screen) {
    screen.appendChild(table);
}

// 좌석 클릭 시 선택
seats.forEach((seat) => {
    seat.addEventListener('click', () => {
        if (t > 0 && !seat.classList.contains('selected-seat')) {
            t--; // 좌석 선택 후 인원 수 감소
            seat.classList.add('selected-seat'); // 좌석에 선택된 스타일 적용
            console.log(`Seat selected${seat.id}, remaining seats: ${t}`);
        } else if (t === 0) {
            alert('더 이상 좌석을 선택할 수 없습니다.'); // 인원이 0일 때 경고
        } else {
            alert('이미 선택된 좌석입니다.'); // 이미 선택된 좌석 클릭 시 경고
        }
    });
});

// sub