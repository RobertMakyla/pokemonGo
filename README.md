##Pokemon GO

This application is based on simple **Akka HTTP** project: http://www.yoppworks.com/2016/08/24/blog/pokemon-go-with-akka-http/

**Starting app**

To start, just launch PokemonServer

**Adding Pokemon**

Send Http/POST request:

    curl -H 'Content-Type: application/json' -X POST -d '{"name": "monster"}' http://localhost:8080/pokemons
    curl -H 'Content-Type: application/json' -X POST -d '{"name": "pikachu"}' http://localhost:8080/pokemons

**Listing Pokemon**

To see current pokemons, go to:

    http://localhost:8080/pokemons