# PHASEZERO-
PhaseZero Catalog Service built using Java &amp; Spring Boot to manage a Product Catalogue through RESTful APIs. 


=> PhaseZero Catalog Service

A  simple product catalogue microservice built with Spring Boot.

The goal of this project is to demonstrate clear thinking, clean structure, and solid understanding of Java + Spring Boot fundamentals.


=> Features

* Add a new product (with validation + business rules)
* List all products
* Search products by name (case-insensitive)
* Filter by category
* Sort by price (ascending)
* Calculate total inventory value
* Meaningful error handling with proper HTTP status codes

 => Data Model — Product
Field	Type	Description
partNumber	String	Unique business identifier
partName	String	Product name (stored in lowercase)
category	String	Product category
price	double	Unit price (must be ≥ 0)
stock	int	Quantity available (must be ≥ 0)

=> Architecture

Controller Layer

Handles all HTTP requests & responses.

Service Layer

Implements business rules:

Normalize partName

Prevent duplicate partNumber

Validate price & stock

=> Repository Layer

Uses an in-memory HashMap to store products.
Simple, fast, and easy to understand.
