-- 코드를 입력하세요
SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS,	
round(avg(REVIEW_SCORE),2) as SCORE
FROM REST_INFO i INNER JOIN REST_REVIEW r ON i.REST_ID = r.REST_ID
GROUP BY r.REST_ID
HAVING i.ADDRESS LIKE '서울%'
ORDER BY SCORE DESC, i.FAVORITES DESC