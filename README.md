##Pokemon GO

This application is based on simple **Akka HTTP** project: http://www.yoppworks.com/2016/08/24/blog/pokemon-go-with-akka-http/

**Seeing Pokemon**

http://pokemon-go-akka-http.herokuapp.com/pokemons

(it may take a while as heroku will probably booting the app)

**Adding Pokemons**

Send Http/POST request:

```bash
    host=http://pokemon-go-akka-http.herokuapp.com/pokemons
    curl -H 'Content-Type: application/json' -X POST -d '{"name": "monster"}' $host
    curl -H 'Content-Type: application/json' -X POST -d '{"name": "pikachu"}' $host
```