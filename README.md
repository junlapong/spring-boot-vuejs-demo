# Spring Boot Demo

## Frontend

```
cd web

# develop
yarn serve

# build
yarn build
```

## Backend

```
# develop
./mvnw spring-boot:run

# test
./mvnw test

# build
./mvnw clean package -Dtest.skip
```

## Notes

- [How to run SPA webapp on Spring Boot 2.x](https://dev.to/composite/how-to-run-spa-webapp-with-spring-boot-2-x-5gdo)
- [Ignore modified (but not committed) files in git?](https://stackoverflow.com/questions/655243/ignore-modified-but-not-committed-files-in-git)

```
git update-index --assume-unchanged src/main/resources/static/index.html
```

__Whats New in Spring Boot 2.3__

<iframe width="560" height="315" src="https://www.youtube.com/embed/WL7U-yGfUXA" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
