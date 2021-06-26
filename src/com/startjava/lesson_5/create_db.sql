DROP TABLE IF EXISTS jaegers;

CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE jaegers
(
    id             INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    modelName      VARCHAR,
    mark           INTEGER,
    height         INTEGER,
    weight         INTEGER,
    status         VARCHAR,
    origin         VARCHAR,
    launch         DATE,
    kaijuKill      INTEGER
);