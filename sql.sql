Encuentre la suma de todos los precios de todas las aplicaciones dentro de la rating tabla.
SELECT SUM(price) FROM rating;

Encuentre el valor máximo total_ratingsde todas las aplicaciones dentro de la rating tabla.
SELECT MAX(total_ratings) FROM rating.

Encuentre los precios promedio agrupados por género dentro de la rating tabla.
SELECT AVG (price) AS preciomedio FROM rating GROUP BY genre.
