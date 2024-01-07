CREATE TABLE health_metrics (
    id INT AUTO_INCREMENT PRIMARY KEY,
    device_id VARCHAR(255),    
    bp VARCHAR(255),
    heart_rate VARCHAR(255),
    o2_level VARCHAR(255)
);