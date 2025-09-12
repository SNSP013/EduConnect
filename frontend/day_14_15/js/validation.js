function login() {
<<<<<<< HEAD
    let username = document.getElementById("loginUsername").value.trim();
    let password = document.getElementById("loginPassword").value.trim();

    if (username === "" || password === "") {
        alert("All fields are required!");
        return;
    }

    let usernameRegex = /^[a-zA-Z0-9_]+$/;
    if(!usernameRegex.test(username)) {
        alert("Username should not contain special characters!");
        return;
    }

    console.log(`Login clicked. Username: ${username}, Password: ${password}`);
}

function register() {
    let name = document.getElementById("registerName").value.trim();
    let email = document.getElementById("registerEmail").value.trim();
    let username = document.getElementById("registerUsername").value.trim();
    let password = document.getElementById("registerPassword").value.trim();

    if (name === "" || email === "" || username === "" || password === "") {
        alert("All fields are required!");
        return;
    }

    // Validate email format
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if(!emailRegex.test(email)) {
        alert("Invalid email address!");
        return;
    }

    // Validate username (no special characters)
    let usernameRegex = /^[a-zA-Z0-9_]+$/;
    if(!usernameRegex.test(username)) {
        alert("Username should not contain special characters!");
        return;
    }

    if(password.length < 8){
        alert("Password should be of more than 8 characters!");
        return;
    }

    // Validate password (at least 8 characters, one capital letter, and one numeric)
    console.log(`Register clicked. Name: ${name}, Email: ${email}, Username: ${username}, Password: ${password}`);
}
module.exports = { register, login };
=======
   
    // You can perform login validation and authentication here
    // For simplicity, let's just display an alert
    
}

function register() {
   

    // Frontend validation for registration form
    

    // Validate email format
    
    // Validate username (no special characters)
    

    // Validate password (at least 8 characters, one capital letter, and one numeric)
    
}
module.exports = { login, register };
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
