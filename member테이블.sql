SELECT * FROM member;

INSERT INTO member
(username,PASSWORD)
VALUES
('cc@naver.com',888);

SELECT * FROM member;

DELETE FROM member
WHERE id IN (14,15,16);