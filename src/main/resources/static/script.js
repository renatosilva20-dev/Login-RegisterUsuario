document.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');
    if (loginForm) {
        loginForm.addEventListener('submit', (event) => {
            event.preventDefault();
            const username = loginForm.username.value;
            const password = loginForm.password.value;

            console.log('Login attempt:');
            console.log('Username:', username);
            console.log('Password:', password);

            alert('Login submitted! Check the console for details.');
        });
    }

    const registerForm = document.getElementById('registerForm');
    if (registerForm) {
        registerForm.addEventListener('submit', (event) => {
            event.preventDefault();
            const newUsername = registerForm.newUsername.value;
            const newPassword = registerForm.newPassword.value;
            const confirmPassword = registerForm.confirmPassword.value;

            if (newPassword !== confirmPassword) {
                alert('Passwords do not match!');
                return;
            }

            console.log('Registration attempt:');
            console.log('Username:', newUsername);
            console.log('Password:', newPassword);

            // In a real app, you'd send this data to your backend
            alert('Registration submitted! Check the console for details.');
        });
    }
});