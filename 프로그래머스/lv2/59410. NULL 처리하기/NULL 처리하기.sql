-- 코드를 입력하세요
SELECT a.ANIMAL_TYPE, ifnull(a.NAME, "No name") "NAME", a.SEX_UPON_INTAKE
FROM ANIMAL_INS a
ORDER BY a.ANIMAL_ID
