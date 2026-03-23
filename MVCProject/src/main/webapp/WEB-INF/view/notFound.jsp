<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>404 | Page Not Found</title>

<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        height: 100vh;
        background: #000000;
        color: #ffffff;
        font-family: -apple-system, BlinkMacSystemFont, "Segoe UI",
                     Roboto, Helvetica, Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        text-align: center;
        animation: fadeIn 1s ease-in-out;
    }

    h1 {
        font-size: 9rem;
        font-weight: 700;
        letter-spacing: -4px;
        margin-bottom: 10px;
    }

    h2 {
        font-size: 1.5rem;
        font-weight: 400;
        color: #aaaaaa;
        margin-bottom: 30px;
    }

    p {
        color: #777777;
        margin-bottom: 40px;
        font-size: 1rem;
    }

    a {
        text-decoration: none;
        color: #ffffff;
        border: 1px solid #ffffff;
        padding: 12px 30px;
        border-radius: 30px;
        font-size: 0.9rem;
        letter-spacing: 1px;
        transition: all 0.3s ease;
    }

    a:hover {
        background: #ffffff;
        color: #000000;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(20px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }
</style>
</head>

<body>

<div class="container">
    <h1>404</h1>
    <h2>Page Not Found</h2>
    <a href="reg">GO HOME</a>
</div>

</body>
</html>
