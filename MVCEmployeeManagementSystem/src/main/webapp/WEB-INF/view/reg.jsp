<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Registration</title>
    
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Bootstrap Icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    
    <style>
		/* ===============================
		   PITCH BLACK THEME OVERRIDE
		   =============================== */

		/* Body background */
		body {
		    background: #000 !important;
		}

		/* Animated background dots */
		body::before {
		    background: radial-gradient(circle, rgba(255,255,255,0.04) 1px, transparent 1px) !important;
		}

		/* Main card */
		.card-custom {
		    background: #0b0b0b !important;
		    box-shadow: 0 25px 70px rgba(0,0,0,0.9) !important;
		}

		/* Card header */
		.card-header-custom {
		    background: #000 !important;
		    border-bottom: 1px solid rgba(255,255,255,0.08);
		}

		/* Icon circle */
		.icon-circle {
		    background: #111 !important;
		    color: #fff !important;
		}

		/* Headings */
		.card-header-custom h1,
		.welcome-text h3 {
		    color: #fff !important;
		}

		/* Sub text */
		.card-header-custom p,
		.welcome-text p,
		.info-text,
		.footer-text {
		    color: #aaa !important;
		}

		/* Info box */
		.info-text {
		    background: rgba(255,255,255,0.03) !important;
		    border-left-color: #333 !important;
		}

		/* Inputs */
		.form-control-custom {
		    background: #000 !important;
		    color: #fff !important;
		    border: 2px solid #222 !important;
		}

		.form-control-custom::placeholder {
		    color: #666 !important;
		}

		/* Input focus */
		.form-control-custom:focus {
		    background: #000 !important;
		    border-color: #555 !important;
		    box-shadow: 0 0 0 2px rgba(255,255,255,0.1) !important;
		}

		/* Icons inside inputs */
		.input-icon,
		.password-toggle {
		    color: #777 !important;
		}

		/* Button */
		.btn-register {
		    background: #111 !important;
		    box-shadow: 0 8px 25px rgba(0,0,0,0.8) !important;
		}

		.btn-register:hover {
		    background: #fff !important;
		    color: #000 !important;
		}

		/* Strength meter background */
		.strength-meter {
		    background: #222 !important;
		}

		/* Scrollbar */
		.registration-container::-webkit-scrollbar-track {
		    background: #111 !important;
		}

		.registration-container::-webkit-scrollbar-thumb {
		    background: #333 !important;
		}

		/* Footer */
		.footer-text {
		    text-shadow: none !important;
		}

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
            position: relative;
            overflow: hidden;
        }
        
        /* Animated Background */
        body::before {
            content: '';
            position: fixed;
            width: 200%;
            height: 200%;
            background: radial-gradient(circle, rgba(255,255,255,0.1) 1px, transparent 1px);
            background-size: 50px 50px;
            animation: moveBackground 20s linear infinite;
            z-index: 0;
            top: 0;
            left: 0;
        }
        
        @keyframes moveBackground {
            0% { transform: translate(0, 0); }
            100% { transform: translate(50px, 50px); }
        }
        
        .registration-container {
            max-width: 550px;
            width: 100%;
            max-height: calc(100vh - 40px);
            overflow-y: auto;
            position: relative;
            z-index: 1;
            animation: fadeInUp 0.8s ease-out;
            padding: 10px;
        }
        
        /* Custom Scrollbar */
        .registration-container::-webkit-scrollbar {
            width: 8px;
        }
        
        .registration-container::-webkit-scrollbar-track {
            background: rgba(255, 255, 255, 0.1);
            border-radius: 10px;
        }
        
        .registration-container::-webkit-scrollbar-thumb {
            background: rgba(255, 255, 255, 0.3);
            border-radius: 10px;
        }
        
        .registration-container::-webkit-scrollbar-thumb:hover {
            background: rgba(255, 255, 255, 0.5);
        }
        
        .card-custom {
            background: white;
            border-radius: 25px;
            box-shadow: 0 20px 60px rgba(0,0,0,0.3);
            overflow: hidden;
            border: none;
        }
        
        .card-header-custom {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 30px 30px;
            text-align: center;
            position: relative;
        }
        
        .card-header-custom::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background: url('data:image/svg+xml,<svg width="100" height="100" xmlns="http://www.w3.org/2000/svg"><defs><pattern id="grid" width="20" height="20" patternUnits="userSpaceOnUse"><path d="M 20 0 L 0 0 0 20" fill="none" stroke="rgba(255,255,255,0.1)" stroke-width="1"/></pattern></defs><rect width="100" height="100" fill="url(%23grid)"/></svg>');
            opacity: 0.5;
        }
        
        .icon-circle {
            width: 70px;
            height: 70px;
            background: white;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 15px;
            font-size: 2.2rem;
            color: #667eea;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
            position: relative;
            z-index: 1;
            animation: pulse 2s ease-in-out infinite;
        }
        
        @keyframes pulse {
            0%, 100% { transform: scale(1); }
            50% { transform: scale(1.05); }
        }
        
        .card-header-custom h1 {
            margin: 0;
            font-weight: 700;
            font-size: 1.6rem;
            position: relative;
            z-index: 1;
            line-height: 1.3;
        }
        
        .card-header-custom p {
            margin: 10px 0 0;
            opacity: 0.95;
            font-size: 1rem;
            position: relative;
            z-index: 1;
        }
        
        .card-body-custom {
            padding: 30px 35px;
        }
        
        .welcome-text {
            text-align: center;
            margin-bottom: 20px;
        }
        
        .welcome-text h3 {
            color: #333;
            font-weight: 600;
            margin-bottom: 8px;
            font-size: 1.3rem;
        }
        
        .welcome-text p {
            color: #666;
            font-size: 0.95rem;
        }
        
        .form-group {
            margin-bottom: 20px;
            position: relative;
        }
        
        .input-group-custom {
            position: relative;
        }
        
        .input-icon {
            position: absolute;
            left: 18px;
            top: 50%;
            transform: translateY(-50%);
            color: #667eea;
            font-size: 1.2rem;
            z-index: 10;
            transition: all 0.3s ease;
        }
        
        .form-control-custom {
            width: 100%;
            padding: 15px 20px 15px 50px;
            border: 2px solid #e0e0e0;
            border-radius: 15px;
            font-size: 1rem;
            transition: all 0.3s ease;
            font-family: 'Poppins', sans-serif;
            background: #f8f9fa;
        }
        
        .form-control-custom:focus {
            outline: none;
            border-color: #667eea;
            background: white;
            box-shadow: 0 5px 20px rgba(102, 126, 234, 0.2);
            transform: translateY(-2px);
        }
        
        .form-control-custom:focus + .input-icon {
            color: #764ba2;
            transform: translateY(-50%) scale(1.1);
        }
        
        .form-control-custom::placeholder {
            color: #999;
        }
        
        .password-toggle {
            position: absolute;
            right: 18px;
            top: 50%;
            transform: translateY(-50%);
            cursor: pointer;
            color: #999;
            font-size: 1.2rem;
            transition: all 0.3s ease;
            z-index: 10;
        }
        
        .password-toggle:hover {
            color: #667eea;
        }
        
        .strength-meter {
            height: 4px;
            background: #e0e0e0;
            border-radius: 2px;
            margin-top: 8px;
            overflow: hidden;
            display: none;
        }
        
        .strength-meter-fill {
            height: 100%;
            width: 0%;
            transition: all 0.3s ease;
            border-radius: 2px;
        }
        
        .strength-weak { background: #f5576c; width: 33%; }
        .strength-medium { background: #f093fb; width: 66%; }
        .strength-strong { background: #28a745; width: 100%; }
        
        .btn-register {
            width: 100%;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            border: none;
            color: white;
            padding: 16px 30px;
            border-radius: 15px;
            font-weight: 600;
            font-size: 1.1rem;
            transition: all 0.3s ease;
            box-shadow: 0 5px 20px rgba(102, 126, 234, 0.3);
            display: flex;
            align-items: center;
            justify-content: center;
            gap: 10px;
            margin-top: 20px;
        }
        
        .btn-register:hover {
            transform: translateY(-3px);
            box-shadow: 0 8px 25px rgba(102, 126, 234, 0.4);
        }
        
        .btn-register:active {
            transform: translateY(-1px);
        }
        
        .btn-register:disabled {
            opacity: 0.7;
            cursor: not-allowed;
        }
        
        .spinner {
            display: none;
            width: 20px;
            height: 20px;
            border: 3px solid rgba(255,255,255,0.3);
            border-top-color: white;
            border-radius: 50%;
            animation: spin 0.8s linear infinite;
        }
        
        @keyframes spin {
            to { transform: rotate(360deg); }
        }
        
        .btn-register.loading .spinner {
            display: inline-block;
        }
        
        .btn-register.loading .btn-text {
            display: none;
        }
        
        .footer-text {
            text-align: center;
            margin-top: 15px;
            margin-bottom: 10px;
            color: white;
            font-size: 0.9rem;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.2);
        }
        
        .footer-text i {
            color: #ffd700;
        }
        
        .info-text {
            background: linear-gradient(135deg, rgba(102, 126, 234, 0.1) 0%, rgba(118, 75, 162, 0.1) 100%);
            border-left: 4px solid #667eea;
            padding: 12px 15px;
            border-radius: 10px;
            margin-bottom: 20px;
            font-size: 0.9rem;
            color: #666;
        }
        
        .info-text i {
            color: #667eea;
            margin-right: 8px;
        }
        
        /* Animations */
        @keyframes fadeInUp {
            from {
                opacity: 0;
                transform: translateY(30px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
        
        @keyframes shake {
            0%, 100% { transform: translateX(0); }
            25% { transform: translateX(-5px); }
            75% { transform: translateX(5px); }
        }
        
        .shake {
            animation: shake 0.3s ease-in-out;
        }
        
        /* Success/Error Messages */
        .alert-custom {
            border-radius: 15px;
            padding: 15px 20px;
            margin-bottom: 20px;
            display: flex;
            align-items: center;
            gap: 10px;
            animation: slideDown 0.3s ease-out;
        }
        
        @keyframes slideDown {
            from {
                opacity: 0;
                transform: translateY(-10px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
        
        /* Validation Styles */
        .form-control-custom.is-valid {
            border-color: #28a745;
        }
        
        .form-control-custom.is-invalid {
            border-color: #f5576c;
        }
        
        .invalid-feedback {
            display: none;
            color: #f5576c;
            font-size: 0.85rem;
            margin-top: 5px;
        }
        
        .form-control-custom.is-invalid ~ .invalid-feedback {
            display: block;
        }
        
        /* Responsive Design */
        @media (max-width: 576px) {
            .card-body-custom {
                padding: 25px 20px;
            }
            
            .card-header-custom h1 {
                font-size: 1.4rem;
            }
            
            .icon-circle {
                width: 60px;
                height: 60px;
                font-size: 2rem;
            }
            
            .welcome-text h3 {
                font-size: 1.1rem;
            }
        }
        
        /* Floating Labels Effect */
        .form-label-float {
            position: absolute;
            left: 50px;
            top: 16px;
            color: #999;
            transition: all 0.3s ease;
            pointer-events: none;
            font-size: 1rem;
        }
        
        .form-control-custom:focus ~ .form-label-float,
        .form-control-custom:not(:placeholder-shown) ~ .form-label-float {
            top: -10px;
            left: 15px;
            font-size: 0.75rem;
            color: #667eea;
            background: white;
            padding: 0 5px;
        }
    </style>
</head>
<body>
    <div class="registration-container">
        <!-- Registration Card -->
        <div class="card-custom">
            <div class="card-header-custom">
                <div class="icon-circle">
                    <i class="bi bi-person-plus-fill"></i>
                </div>
                <h1>Employee Management System</h1>
                <p>Create your account to get started</p>
            </div>
            
            <div class="card-body-custom">
                <!-- Welcome Text -->
                <div class="welcome-text">
                    <h3>Welcome! 👋</h3>
                    <p>Please fill in your details to register</p>
                </div>
                
                <!-- Info Box -->
                <div class="info-text">
                    <i class="bi bi-info-circle-fill"></i>
                    All fields are required for registration
                </div>
                
                <!-- Registration Form -->
                <form action="read" method="post" id="registrationForm">
                    
                    <!-- First Name -->
                    <div class="form-group">
                        <div class="input-group-custom">
                            <i class="bi bi-person input-icon"></i>
                            <input type="text" 
                                   name="fname" 
                                   class="form-control-custom" 
                                   placeholder="First Name"
                                   required
                                   maxlength="50"
                                   pattern="[A-Za-z\s]+"
                                   title="Only letters and spaces allowed">
                            <div class="invalid-feedback">Please enter a valid first name</div>
                        </div>
                    </div>
                    
                    <!-- Last Name -->
                    <div class="form-group">
                        <div class="input-group-custom">
                            <i class="bi bi-person-badge input-icon"></i>
                            <input type="text" 
                                   name="lname" 
                                   class="form-control-custom" 
                                   placeholder="Last Name"
                                   required
                                   maxlength="50"
                                   pattern="[A-Za-z\s]+"
                                   title="Only letters and spaces allowed">
                            <div class="invalid-feedback">Please enter a valid last name</div>
                        </div>
                    </div>
                    
                    <!-- Password -->
                    <div class="form-group">
                        <div class="input-group-custom">
                            <i class="bi bi-lock input-icon"></i>
                            <input type="password" 
                                   name="password" 
                                   id="password"
                                   class="form-control-custom" 
                                   placeholder="Password"
                                   required
                                   minlength="6"
                                   title="Password must be at least 6 characters">
                            <i class="bi bi-eye password-toggle" id="togglePassword"></i>
                            <div class="invalid-feedback">Password must be at least 6 characters</div>
                        </div>
                        <div class="strength-meter" id="strengthMeter">
                            <div class="strength-meter-fill" id="strengthMeterFill"></div>
                        </div>
                    </div>
                    
                    <!-- Age -->
                    <div class="form-group">
                        <div class="input-group-custom">
                            <i class="bi bi-calendar-event input-icon"></i>
                            <input type="number" 
                                   name="age" 
                                   class="form-control-custom" 
                                   placeholder="Age (18-60)"
                                   required
                                   min="18"
                                   max="60"
                                   title="Age must be between 18 and 60">
                            <div class="invalid-feedback">Age must be between 18 and 60</div>
                        </div>
                    </div>
                    
                    <!-- Register Button -->
                    <button type="submit" class="btn-register" id="submitBtn">
                        <span class="btn-text">
                            <i class="bi bi-check-circle"></i>
                            Register Now
                        </span>
                        <span class="spinner"></span>
                    </button>
                    
                </form>
            </div>
        </div>
        
        <!-- Footer Text -->
        <div class="footer-text">
            <i class="bi bi-shield-check"></i>
            © 2026 Employee Management System. All rights reserved.
        </div>
    </div>
    
    <!-- Bootstrap 5 JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    
    <script>
        // Form Elements
        const form = document.getElementById('registrationForm');
        const submitBtn = document.getElementById('submitBtn');
        const passwordInput = document.getElementById('password');
        const togglePassword = document.getElementById('togglePassword');
        const strengthMeter = document.getElementById('strengthMeter');
        const strengthMeterFill = document.getElementById('strengthMeterFill');
        
        // Password Toggle
        togglePassword.addEventListener('click', function() {
            const type = passwordInput.getAttribute('type') === 'password' ? 'text' : 'password';
            passwordInput.setAttribute('type', type);
            this.classList.toggle('bi-eye');
            this.classList.toggle('bi-eye-slash');
        });
        
        // Password Strength Meter
        passwordInput.addEventListener('input', function() {
            const password = this.value;
            strengthMeter.style.display = password.length > 0 ? 'block' : 'none';
            
            let strength = 0;
            if (password.length >= 6) strength++;
            if (password.length >= 10) strength++;
            if (/[A-Z]/.test(password)) strength++;
            if (/[0-9]/.test(password)) strength++;
            if (/[^A-Za-z0-9]/.test(password)) strength++;
            
            strengthMeterFill.className = 'strength-meter-fill';
            if (strength <= 2) {
                strengthMeterFill.classList.add('strength-weak');
            } else if (strength <= 3) {
                strengthMeterFill.classList.add('strength-medium');
            } else {
                strengthMeterFill.classList.add('strength-strong');
            }
        });
        
        // Form Validation
        const inputs = document.querySelectorAll('.form-control-custom');
        inputs.forEach(input => {
            // Real-time validation
            input.addEventListener('input', function() {
                if (this.validity.valid) {
                    this.classList.remove('is-invalid');
                    this.classList.add('is-valid');
                } else {
                    this.classList.remove('is-valid');
                    this.classList.add('is-invalid');
                }
            });
            
            // Focus animations
            input.addEventListener('focus', function() {
                this.parentElement.style.transform = 'scale(1.02)';
                this.parentElement.style.transition = 'transform 0.2s ease';
            });
            
            input.addEventListener('blur', function() {
                this.parentElement.style.transform = 'scale(1)';
                
                // Validate on blur
                if (!this.validity.valid && this.value) {
                    this.classList.add('is-invalid');
                    this.parentElement.classList.add('shake');
                    setTimeout(() => {
                        this.parentElement.classList.remove('shake');
                    }, 300);
                }
            });
        });
        
        // Auto-capitalize first letter
        const nameInputs = document.querySelectorAll('input[name="fname"], input[name="lname"]');
        nameInputs.forEach(input => {
            input.addEventListener('blur', function() {
                if (this.value) {
                    this.value = this.value.charAt(0).toUpperCase() + this.value.slice(1);
                }
            });
        });
        
        // Form Submission
        form.addEventListener('submit', function(e) {
            // Validate all fields
            let isValid = true;
            inputs.forEach(input => {
                if (!input.validity.valid) {
                    isValid = false;
                    input.classList.add('is-invalid');
                }
            });
            
            if (!isValid) {
                e.preventDefault();
                alert('Please fill in all fields correctly');
                return false;
            }
            
            // Add loading state
            submitBtn.classList.add('loading');
            submitBtn.disabled = true;
        });
        
        // Fade in animation on load
        window.addEventListener('load', function() {
            document.body.style.opacity = '0';
            setTimeout(function() {
                document.body.style.transition = 'opacity 0.5s';
                document.body.style.opacity = '1';
            }, 100);
        });
        
        // Keyboard shortcuts
        document.addEventListener('keydown', function(e) {
            // Ctrl/Cmd + Enter to submit
            if ((e.ctrlKey || e.metaKey) && e.key === 'Enter') {
                e.preventDefault();
                form.submit();
            }
        });
        
        // Prevent form resubmission on refresh
        if (window.history.replaceState) {
            window.history.replaceState(null, null, window.location.href);
        }
    </script>
</body>
</html>