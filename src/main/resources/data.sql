INSERT INTO artist_table (artist_id, artist_name) VALUES (1, 'art2');
INSERT INTO artist_table (artist_id, artist_name) VALUES (2, 'art3');

INSERT INTO ranking_table (ranking_id, ranking_name, artist_id) VALUES (1, 'rank3', 1);
INSERT INTO ranking_table (ranking_id, ranking_name, artist_id) VALUES (2, 'rank3', 2);

INSERT INTO post_table (post_id, post_description) VALUES (1, 'post1');
INSERT INTO post_table (post_id, post_description) VALUES (2, 'post2');

INSERT INTO comment_table (comment_id, comment_description, post_id) VALUES (1, 'comm1', 1);
INSERT INTO comment_table (comment_id, comment_description, post_id) VALUES (2, 'comm2', 1);
INSERT INTO comment_table (comment_id, comment_description, post_id) VALUES (3, 'comm3', 2);
INSERT INTO comment_table (comment_id, comment_description, post_id) VALUES (4, 'comm4', 2); 


INSERT INTO user_table (id, username, password) VALUES (1, 'foo', '$2a$10$rOLi6eTSIJ7A/IYP6pI9U.JAJ/KpNiiktAcKQNQueRTzKlqg/UcKW'); 
INSERT INTO user_table (id, username, password) VALUES (2, 'boo', '$2a$10$lP5so7OaV.IAloU53NgFredHeZCS5sq3YK4XKAgqbJjikNz8BgMuW');

INSERT INTO farm_table (id, name) VALUES (3, 'frm1');
INSERT INTO farm_table (id, name) VALUES (4, 'frm2');

INSERT INTO account_table (id, name, user_id, farm_id) VALUES (5, 'acc1', 1, 3);
INSERT INTO account_table (id, name, user_id, farm_id) VALUES (6, 'acc2', 1, 4);

INSERT INTO customer_table (id, name) VALUES (1, 'cust1');
INSERT INTO customer_table (id, name) VALUES (2, 'cust2');