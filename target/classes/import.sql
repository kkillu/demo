INSERT INTO demo (name) SELECT 'Bratislava' WHERE NOT EXISTS (SELECT * from Demo WHERE name='Bratislava');