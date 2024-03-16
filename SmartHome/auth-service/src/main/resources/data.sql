CREATE SCHEMA IF NOT EXISTS AuthService;
INSERT INTO authservice.users(id, username, email, password) VALUES
    (1, 'admin', 'admin@admin.com', 'admin');