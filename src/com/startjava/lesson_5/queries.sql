SELECT *
FROM jaegers;

SELECT *
FROM jaegers
WHERE status = 'Undestroyed';

SELECT *
FROM jaegers
WHERE mark = '1';

SELECT *
FROM jaegers
WHERE mark = '6';

SELECT *
FROM jaegers
ORDER BY mark DESC;

SELECT *
FROM jaegers
ORDER BY launch
    FETCH FIRST 1 ROW ONLY;

SELECT *
FROM jaegers
WHERE kaijukill = (
    SELECT MIN( kaijukill )
    FROM jaegers );

SELECT AVG(weight)
FROM jaegers;

UPDATE jaegers
    SET kaijukill = kaijukill+1;

DELETE FROM jaegers
where status = 'Destroyed';

