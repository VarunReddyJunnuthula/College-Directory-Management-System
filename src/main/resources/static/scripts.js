document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const role = document.getElementById('role').value;

    fetch('/api/auth/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, password, role })
    })
        .then(response => response.json())
        .then(data => {
            // Handle successful login
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });
});
