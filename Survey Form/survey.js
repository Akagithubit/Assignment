const popup = document.getElementById('popup');
const popupContent = document.getElementById('popup-content');
const closePopup = document.getElementById('closePopup');

form.addEventListener('submit', function (e) {
    e.preventDefault();

    const formData = new FormData(form);
    const results = {};

    for (const [key, value] of formData.entries()) {
        results[key] = value;
    }

    const popupResults = document.getElementById('popup-results');
    popupResults.innerHTML = '';

    for (const key in results) {
        const label = document.createElement('label');
        label.textContent = key + ':';
        const value = document.createElement('span');
        value.textContent = results[key];
        popupResults.appendChild(label);
        popupResults.appendChild(value);
        popupResults.appendChild(document.createElement('br'));
    }

    popup.style.display = 'flex';
});

closePopup.addEventListener('click', function () {
    popup.style.display = 'none';
    form.reset();
});

const resetButton = document.getElementById('resetButton');
resetButton.addEventListener('click', function () {
    form.reset();
});