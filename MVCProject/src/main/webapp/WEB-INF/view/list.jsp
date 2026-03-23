<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management</title>
    
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
        }
        
        .navbar-custom {
            background: rgba(255, 255, 255, 0.95);
            border-bottom: 1px solid #f0f0f0;
            backdrop-filter: blur(20px);
            padding: 1rem 0;
        }
        
        .navbar-brand {
            font-weight: 600;
            font-size: 1.3rem;
            color: #1d1d1d !important;
            letter-spacing: -0.5px;
        }
        
        .container-custom {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 20px;
        }
        
        .hero-section {
            padding: 80px 20px 60px;
            text-align: center;
        }
        
        .hero-section h1 {
            font-size: 3.5rem;
            font-weight: 700;
            color: #1d1d1d;
            letter-spacing: -1.5px;
            margin-bottom: 20px;
            line-height: 1.2;
        }
        
        .hero-section p {
            font-size: 1.2rem;
            color: #6f6f6f;
            max-width: 600px;
            margin: 0 auto;
            font-weight: 400;
            letter-spacing: -0.3px;
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
            padding: 40px 40px 30px;
        }
        
        .card-header-apple h2 {
            margin: 0;
            font-weight: 600;
            font-size: 1.8rem;
            color: #1d1d1d;
            letter-spacing: -0.5px;
            display: flex;
            align-items: center;
            gap: 12px;
        }
        
        .card-header-apple h2 i {
            font-size: 1.6rem;
            color: #0071e3;
        }
        
        .badge-count {
            display: inline-block;
            background: #f5f5f7;
            color: #1d1d1d;
            padding: 4px 12px;
            border-radius: 12px;
            font-size: 0.85rem;
            font-weight: 500;
            margin-left: auto;
        }
        
        .table-responsive-custom {
            padding: 40px;
        }
        
        .table-apple {
            margin: 0;
            border-collapse: separate;
            border-spacing: 0;
        }
        
        .table-apple thead {
            background: #f5f5f7;
        }
        
        .table-apple thead th {
            border: none;
            padding: 16px 20px;
            font-weight: 600;
            font-size: 0.85rem;
            color: #6f6f6f;
            text-transform: uppercase;
            letter-spacing: 0.3px;
        }
        
        .table-apple tbody tr {
            border-bottom: 1px solid #f0f0f0;
            transition: background-color 0.2s ease;
        }
        
        .table-apple tbody tr:last-child {
            border-bottom: none;
        }
        
        .table-apple tbody tr:hover {
            background: #f9f9f9;
        }
        
        .table-apple tbody td {
            padding: 20px;
            vertical-align: middle;
            border: none;
            color: #1d1d1d;
            font-weight: 400;
        }
        
        .person-id {
            font-weight: 600;
            color: #0071e3;
            font-size: 1rem;
            font-variant-numeric: tabular-nums;
        }
        
        .person-name {
            font-weight: 500;
            color: #1d1d1d;
        }
        
        .person-age {
            display: inline-block;
            background: #f5f5f7;
            color: #1d1d1d;
            padding: 6px 14px;
            border-radius: 12px;
            font-weight: 500;
            font-size: 0.9rem;
        }
        
        .action-buttons {
            display: flex;
            gap: 12px;
            justify-content: center;
        }
        
        .btn-apple {
            border: none;
            padding: 10px 20px;
            border-radius: 10px;
            font-weight: 500;
            font-size: 0.9rem;
            transition: all 0.2s ease;
            cursor: pointer;
            display: inline-flex;
            align-items: center;
            gap: 6px;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto;
            letter-spacing: -0.2px;
        }
        
        .btn-edit {
            background: #0071e3;
            color: white;
        }
        
        .btn-edit:hover {
            background: #0077ed;
            box-shadow: 0 4px 14px rgba(0, 113, 227, 0.25);
            transform: translateY(-1px);
            color: white;
        }
        
        .btn-delete {
            background: #f5f5f7;
            color: #1d1d1d;
        }
        
        .btn-delete:hover {
            background: #e8e8ed;
            box-shadow: 0 4px 14px rgba(0, 0, 0, 0.08);
            transform: translateY(-1px);
            color: #1d1d1d;
        }
        
        .empty-state {
            text-align: center;
            padding: 80px 40px;
            color: #6f6f6f;
        }
        
        .empty-state i {
            font-size: 5rem;
            margin-bottom: 20px;
            color: #d0d0d0;
        }
        
        .empty-state h3 {
            margin-bottom: 12px;
            color: #1d1d1d;
            font-weight: 600;
            font-size: 1.4rem;
            letter-spacing: -0.3px;
        }
        
        .empty-state p {
            color: #6f6f6f;
            font-size: 1rem;
        }
        
        .btn-add {
            position: fixed;
            bottom: 40px;
            right: 40px;
            width: 56px;
            height: 56px;
            border-radius: 50%;
            background: #0071e3;
            border: none;
            color: white;
            font-size: 1.3rem;
            box-shadow: 0 8px 24px rgba(0, 113, 227, 0.3);
            transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
            z-index: 1000;
            display: flex;
            align-items: center;
            justify-content: center;
            cursor: pointer;
            font-weight: 500;
        }
        
        .btn-add:hover {
            background: #0077ed;
            box-shadow: 0 12px 32px rgba(0, 113, 227, 0.35);
            transform: scale(1.08);
        }
        
        .btn-add:active {
            transform: scale(0.96);
        }
        
        .footer-section {
            background: #f5f5f7;
            border-top: 1px solid #f0f0f0;
            padding: 60px 20px;
            margin-top: 80px;
        }
        
        .footer-text {
            text-align: center;
            color: #6f6f6f;
            font-size: 0.9rem;
            font-weight: 400;
            letter-spacing: -0.2px;
        }
        
        .form-apple {
            background: #ffffff;
            border: 1px solid #f0f0f0;
            border-radius: 18px;
            padding: 40px;
            max-width: 500px;
            margin: 60px auto;
            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.06);
        }
        
        .form-apple h2 {
            font-size: 2rem;
            font-weight: 600;
            color: #1d1d1d;
            margin-bottom: 30px;
            letter-spacing: -0.5px;
        }
        
        .form-group-apple {
            margin-bottom: 24px;
        }
        
        .form-group-apple label {
            display: block;
            margin-bottom: 8px;
            font-weight: 500;
            color: #1d1d1d;
            font-size: 0.95rem;
            letter-spacing: -0.2px;
        }
        
        .form-control-apple {
            width: 100%;
            padding: 12px 16px;
            border: 1px solid #d0d0d0;
            border-radius: 10px;
            font-size: 1rem;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto;
            transition: all 0.2s ease;
            color: #1d1d1d;
        }
        
        .form-control-apple:focus {
            outline: none;
            border-color: #0071e3;
            box-shadow: 0 0 0 3px rgba(0, 113, 227, 0.1);
        }
        
        .form-control-apple::placeholder {
            color: #a1a1a6;
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
        }
        
        .btn-submit-apple:hover {
            background: #0077ed;
            box-shadow: 0 8px 24px rgba(0, 113, 227, 0.25);
            transform: translateY(-1px);
        }
        
        .btn-submit-apple:active {
            transform: translateY(0);
        }
        
        @media (max-width: 768px) {
            .hero-section {
                padding: 60px 20px 40px;
            }
            
            .hero-section h1 {
                font-size: 2.2rem;
            }
            
            .hero-section p {
                font-size: 1.05rem;
            }
            
            .card-header-apple {
                padding: 30px 20px 20px;
            }
            
            .table-responsive-custom {
                padding: 20px;
            }
            
            .table-apple thead {
                display: none;
            }
            
            .table-apple tbody tr {
                display: block;
                margin-bottom: 16px;
                border-radius: 12px;
                border: 1px solid #f0f0f0;
                overflow: hidden;
                background: #f9f9f9;
            }
            
            .table-apple tbody td {
                display: flex;
                justify-content: space-between;
                padding: 16px;
                border-bottom: 1px solid #f0f0f0;
            }
            
            .table-apple tbody td:last-child {
                border-bottom: none;
            }
            
            .table-apple tbody td:before {
                content: attr(data-label);
                font-weight: 600;
                color: #0071e3;
                min-width: 100px;
            }
            
            .action-buttons {
                flex-wrap: wrap;
            }
            
            .btn-add {
                bottom: 30px;
                right: 30px;
                width: 52px;
                height: 52px;
            }
            
            .form-apple {
                padding: 30px 20px;
                max-width: 100%;
                margin: 40px 0;
            }
        }
        
        @media (max-width: 480px) {
            .hero-section h1 {
                font-size: 1.8rem;
            }
            
            .card-header-apple h2 {
                font-size: 1.4rem;
                flex-direction: column;
                align-items: flex-start;
            }
            
            .badge-count {
                margin-left: 0;
                margin-top: 12px;
            }
        }
    </style>
</head>
<body>
    <!-- Navigation -->
    <nav class="navbar-custom">
        <div class="container-custom">
            <span class="navbar-brand">
                <i class="bi bi-briefcase"></i> Employee Management
            </span>
        </div>
    </nav>
    
    <!-- Hero Section -->
    <div class="hero-section">
        <h1>Manage Your Team</h1>
        <p>A clean, elegant way to organize and manage employee information</p>
    </div>
    
    <!-- Main Content -->
    <div class="container-custom">
        <!-- Employee List Card -->
        <div class="card-apple">
            <div class="card-header-apple">
                <h2>
                    <i class="bi bi-people"></i>
                    Team Members
                    <span class="badge-count">${persons.size()} employees</span>
                </h2>
            </div>
            
            <div class="table-responsive-custom">
                <c:choose>
                    <c:when test="${empty persons}">
                        <!-- Empty State -->
                        <div class="empty-state">
                            <i class="bi bi-inbox"></i>
                            <h3>No Employees Yet</h3>
                            <p>Start by adding your first team member</p>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <!-- Table -->
                        <table class="table-apple">
                            <thead>
                                <tr>
                                    <th style="width: 15%;">ID</th>
                                    <th style="width: 25%;">First Name</th>
                                    <th style="width: 25%;">Last Name</th>
                                    <th style="width: 15%;">Age</th>
                                    <th style="width: 20%;">Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="p" items="${persons}">
                                    <tr>
                                        <td data-label="ID">
                                            <span class="person-id">#${p.id}</span>
                                        </td>
                                        <td data-label="First Name">
                                            <span class="person-name">${p.fname}</span>
                                        </td>
                                        <td data-label="Last Name">
                                            <span class="person-name">${p.lname}</span>
                                        </td>
                                        <td data-label="Age">
                                            <span class="person-age">${p.age} yrs</span>
                                        </td>
                                        <td data-label="Actions">
                                            <div class="action-buttons">
                                                <!-- Edit Button -->
                                                <form action="update" method="get" style="display: inline;">
                                                    <input type="hidden" name="id" value="${p.id}">
                                                    <button type="submit" class="btn-apple btn-edit">
                                                        <i class="bi bi-pencil"></i> Edit
                                                    </button>
                                                </form>
                                                
                                                <!-- Delete Button -->
                                                <form action="delete" method="get" style="display: inline;">
                                                    <input type="hidden" name="id" value="${p.id}">
                                                    <button type="submit" class="btn-apple btn-delete" 
                                                            onclick="return confirm('Remove ${p.fname} ${p.lname}?')">
                                                        <i class="bi bi-trash"></i> Delete
                                                    </button>
                                                </form>
                                            </div>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </div>
    
    <!-- Floating Add Button -->
    <button class="btn-add" onclick="window.location.href='reg'" title="Add New Employee">
        <i class="bi bi-plus-lg"></i>
    </button>
    
    <!-- Footer -->
    <div class="footer-section">
        <div class="container-custom">
            <p class="footer-text">© 2024 Employee Management System. All rights reserved.</p>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>