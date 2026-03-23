<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Login</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        html, body {
            height: 100%;
        }
        
        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif;
            background: #ffffff;
            color: #1d1d1d;
            line-height: 1.6;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            padding: 20px;
        }
        
        .navbar-top {
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            background: rgba(255, 255, 255, 0.95);
            border-bottom: 1px solid #f0f0f0;
            backdrop-filter: blur(20px);
            padding: 1rem 0;
            z-index: 100;
        }
        
        .container-custom {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 20px;
        }
        
        .navbar-brand {
            font-weight: 600;
            font-size: 1.1rem;
            color: #1d1d1d;
            letter-spacing: -0.3px;
        }
        
        .login-wrapper {
            width: 100%;
            max-width: 500px;
            padding-top: 60px;
        }
        
        .card-apple {
            background: #ffffff;
            border: 1px solid #f0f0f0;
            border-radius: 18px;
            overflow: hidden;
            transition: all 0.35s cubic-bezier(0.4, 0, 0.2, 1);
            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.06);
        }
        
        .card-apple:hover {
            border-color: #e0e0e0;
            box-shadow: 0 12px 28px rgba(0, 0, 0, 0.08);
        }
        
        .card-header-apple {
            background: #ffffff;
            border-bottom: 1px solid #f0f0f0;
            padding: 50px 40px 40px;
            text-align: center;
        }
        
        .icon-circle {
            width: 80px;
            height: 80px;
            background: #f5f5f7;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 24px;
            font-size: 2.4rem;
            color: #0071e3;
            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.06);
            transition: all 0.2s ease;
        }
        
        .card-apple:hover .icon-circle {
            transform: scale(1.05);
            box-shadow: 0 4px 12px rgba(0, 113, 227, 0.15);
        }
        
        .card-header-apple h1 {
            margin: 0;
            font-weight: 600;
            font-size: 1.8rem;
            color: #1d1d1d;
            letter-spacing: -0.5px;
            margin-bottom: 8px;
        }
        
        .card-header-apple p {
            margin: 0;
            color: #6f6f6f;
            font-size: 0.95rem;
            font-weight: 400;
        }
        
        .card-body-apple {
            padding: 40px;
        }
        
        .welcome-text {
            text-align: center;
            margin-bottom: 32px;
        }
        
        .welcome-text h3 {
            color: #1d1d1d;
            font-weight: 600;
            margin-bottom: 8px;
            font-size: 1.3rem;
            letter-spacing: -0.3px;
        }
        
        .welcome-text p {
            color: #6f6f6f;
            font-size: 0.95rem;
            font-weight: 400;
        }
        
        .form-group-apple {
            margin-bottom: 24px;
        }
        
        .form-label-apple {
            display: block;
            margin-bottom: 8px;
            font-weight: 500;
            color: #1d1d1d;
            font-size: 0.95rem;
            letter-spacing: -0.2px;
        }
        
        .input-group-custom {
            position: relative;
        }
        
        .input-icon {
            position: absolute;
            left: 16px;
            top: 50%;
            transform: translateY(-50%);
            color: #0071e3;
            font-size: 1.1rem;
            z-index: 10;
            pointer-events: none;
            transition: all 0.2s ease;
        }
        
        .form-control-apple {
            width: 100%;
            padding: 12px 16px 12px 48px;
            border: 1px solid #d0d0d0;
            border-radius: 10px;
            font-size: 1rem;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto;
            transition: all 0.2s ease;
            color: #1d1d1d;
            letter-spacing: -0.2px;
            background: #ffffff;
        }
        
        .form-control-apple:focus {
            outline: none;
            border-color: #0071e3;
            box-shadow: 0 0 0 3px rgba(0, 113, 227, 0.1);
            transform: translateY(-1px);
        }
        
        .form-control-apple:focus + .input-icon {
            color: #0077ed;
            transform: translateY(-50%) scale(1.1);
        }
        
        .form-control-apple::placeholder {
            color: #a1a1a6;
        }
        
        .form-control-apple.is-valid {
            border-color: #27ae60;
        }
        
        .form-control-apple.is-invalid {
            border-color: #e74c3c;
        }
        
        .invalid-feedback {
            display: none;
            color: #e74c3c;
            font-size: 0.8rem;
            margin-top: 6px;
        }
        
        .form-control-apple.is-invalid ~ .invalid-feedback {
            display: block;
        }
        
        .info-text {
            background: #f5f5f7;
            border-left: 3px solid #0071e3;
            padding: 12px 16px;
            border-radius: 8px;
            margin-bottom: 24px;
            font-size: 0.9rem;
            color: #6f6f6f;
            display: flex;
            align-items: flex-start;
            gap: 10px;
        }
        
        .info-text i {
            color: #0071e3;
            font-size: 1rem;
            margin-top: 2px;
            flex-shrink: 0;
        }
        
        .btn-submit-apple {
            width: 100%;
            padding: 14px 20px;
            background: #0071e3;
            color: white;
            border: none;
            border-radius: 10px;
            font-weight: 600;
            font-size: 1rem;
            cursor: pointer;
            transition: all 0.2s ease;
            letter-spacing: -0.2px;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto;
            display: flex;
            align-items: center;
            justify-content: center;
            gap: 10px;
            margin-top: 8px;
        }
        
        .btn-submit-apple:hover {
            background: #0077ed;
            box-shadow: 0 8px 24px rgba(0, 113, 227, 0.25);
            transform: translateY(-1px);
        }
        
        .btn-submit-apple:active {
            transform: translateY(0);
        }
        
        .btn-submit-apple:disabled {
            opacity: 0.6;
            cursor: not-allowed;
            transform: none;
        }
        
        .spinner {
            display: none;
            width: 18px;
            height: 18px;
            border: 2px solid rgba(255, 255, 255, 0.3);
            border-top-color: white;
            border-radius: 50%;
            animation: spin 0.6s linear infinite;
        }
        
        @keyframes spin {
            to {
                transform: rotate(360deg);
            }
        }
        
        .btn-submit-apple.loading .spinner {
            display: inline-block;
        }
        
        .btn-submit-apple.loading .btn-text {
            display: none;
        }
        
        .signup-link {
            text-align: center;
            margin-top: 24px;
            color: #6f6f6f;
            font-size: 0.9rem;
        }
        
        .signup-link a {
            color: #0071e3;
            text-decoration: none;
            font-weight: 600;
            transition: all 0.2s ease;
        }
        
        .signup-link a:hover {
            color: #0077ed;
            text-decoration: underline;
        }
        
        .footer-text {
            text-align: center;
            margin-top: 32px;
            color: #6f6f6f;
            font-size: 0.85rem;
            font-weight: 400;
            letter-spacing: -0.2px;
        }
        
        .alert-error {
            background: #ffe5e5;
            color: #c41e3a;
            border: 1px solid #ffcccc;
            padding: 12px 16px;
            border-radius: 10px;
            margin-bottom: 24px;
            display: flex;
            align-items: center;
            gap: 10px;
            font-size: 0.9rem;
        }
        
        .alert-error i {
            font-size: 1.1rem;
            flex-shrink: 0;
        }
        
        @media (max-width: 768px) {
            .card-header-apple {
                padding: 40px 30px 30px;
            }
            
            .card-body-apple {
                padding: 30px;
            }
            
            .card-header-apple h1 {
                font-size: 1.5rem;
            }
            
            .icon-circle {
                width: 70px;
                height: 70px;
                font-size: 2rem;
            }
            
            .login-wrapper {
                padding-top: 70px;
            }
        }
        
        @media (max-width: 480px) {
            .card-header-apple {
                padding: 30px 20px 20px;
            }
            
            .card-body-apple {
                padding: 20px;
            }
            
            .card-header-apple h1 {
                font-size: 1.3rem;
            }
            
            .welcome-text h3 {
                font-size: 1.1rem;
            }
            
            .login-wrapper {
                padding-top: 60px;
            }
        }
    </style>
</head>
<body>
    <!-- Navigation -->
    <nav class="navbar-top">
        <div class="container-custom">
            <span class="navbar-brand">
                <i class="bi bi-briefcase"></i> Employee Management
            </span>
        </div>
    </nav>
    
    <!-- Login Container -->
    <div class="login-wrapper">
        <!-- Login Card -->
        <div class="card-apple">
            <div class="card-header-apple">
                <div class="icon-circle">
                    <i class="bi bi-person-check"></i>
                </div>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
                <h1>Welcome Back</h1>
                <p>Sign in to your account</p>
            </div>
            
            <div class="card-body-apple">
                <!-- Welcome Text -->
                <div class="welcome-text">
                    <h3>Employee Login</h3>
                    <p>Enter your credentials to continue</p>
                </div>
                
                <!-- Error Message -->
                <% if (request.getParameter("error") != null) { %>
                    <div class="alert-error">
                        <i class="bi bi-exclamation-circle-fill"></i>
                        <span>Invalid credentials. Please try again.</span>
                    </div>
                <% } %>
                
                <!-- Info Box -->
                <div class="info-text">
                    <i class="bi bi-info-circle-fill"></i>
                    <span>Enter your first name, last name and password to login</span>
                </div>
                
                <!-- Login Form -->
                <form action="login/validate" method="post" id="loginForm" novalidate>
                    
                    <!-- First Name -->
                    <div class="form-group-apple">
                        <label class="form-label-apple">First Name</label>
                        <div class="input-group-custom">
                            <i class="bi bi-person input-icon"></i>
                            <input type="text" 
                                   name="fname" 
                                   class="form-control-apple" 
                                   placeholder="John"
                                   required
                                   maxlength="50"
                                   pattern="[A-Za-z\s]+"
                                   title="Only letters and spaces allowed">
                            <div class="invalid-feedback">Please enter a valid first name</div>
                        </div>
                    </div>
                    
                    <!-- Last Name -->
                    <div class="form-group-apple">
                        <label class="form-label-apple">Last Name</label>
                        <div class="input-group-custom">
                            <i class="bi bi-person-badge input-icon"></i>
                            <input type="text" 
                                   name="lname" 
                                   class="form-control-apple" 
                                   placeholder="Doe"
                                   required
                                   maxlength="50"
                                   pattern="[A-Za-z\s]+"
                                   title="Only letters and spaces allowed">
                            <div class="invalid-feedback">Please enter a valid last name</div>
                        </div>
                    </div>
                    
                    <!-- Password -->
                    <div class="form-group-apple">
                        <label class="form-label-apple">Password</label>
                        <div class="input-group-custom">
                            <i class="bi bi-lock input-icon"></i>
                            <input type="password" 
                                   name="password" 
                                   id="password"
                                   class="form-control-apple" 
                                   placeholder="••••••"
                                   required
                                   minlength="6"
                                   title="Password must be at least 6 characters">
                            <div class="invalid-feedback">Password must be at least 6 characters</div>
                        </div>
                    </div>
                    
                    <!-- Submit Button -->
                    <button type="submit" class="btn-submit-apple" id="submitBtn">
                        <span class="btn-text">
                            <i class="bi bi-box-arrow-in-right"></i>
                            Login
                        </span>
                        <span class="spinner"></span>
                    </button>
                    
                </form>
                
                <!-- Signup Link -->
                <div class="signup-link">
                    Don't have an account? <a href="/reg">Sign Up</a>
                </div>
            </div>
        </div>
        
        <!-- Footer Text -->
        <div class="footer-text">
            © 2024 Employee Management System. All rights reserved.
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    
    <script>
        const form = document.getElementById('loginForm');
        const submitBtn = document.getElementById('submitBtn');
        const inputs = document.querySelectorAll('.form-control-apple');
        
        // Input Validation on Input
        inputs.forEach(input => {
            input.addEventListener('input', function() {
                if (this.value && this.validity.valid) {
                    this.classList.remove('is-invalid');
                    this.classList.add('is-valid');
                } else if (this.value && !this.validity.valid) {
                    this.classList.remove('is-valid');
                    this.classList.add('is-invalid');
                } else {
                    this.classList.remove('is-invalid', 'is-valid');
                }
            });
            
            input.addEventListener('blur', function() {
                if (this.value && !this.validity.valid) {
                    this.classList.add('is-invalid');
                }
            });
        });
        
        // Auto-capitalize names
        const nameInputs = document.querySelectorAll('input[name="fname"], input[name="lname"]');
        nameInputs.forEach(input => {
            input.addEventListener('blur', function() {
                if (this.value) {
                    this.value = this.value.charAt(0).toUpperCase() + this.value.slice(1).toLowerCase();
                }
            });
        });
        
        // Form Submission
        form.addEventListener('submit', function(e) {
            let isValid = true;
            
            // Validate all fields
            inputs.forEach(input => {
                if (!input.validity.valid) {
                    isValid = false;
                    input.classList.add('is-invalid');
                }
            });
            
            if (!isValid) {
                e.preventDefault();
                return false;
            }
            
            // Add loading state
            submitBtn.classList.add('loading');
            submitBtn.disabled = true;
        });
        
        // Keyboard shortcut to submit
        document.addEventListener('keydown', function(e) {
            if ((e.ctrlKey || e.metaKey) && e.key === 'Enter') {
                e.preventDefault();
                form.submit();
            }
        });
    </script>
</body>
</html>