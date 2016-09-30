##Pokemon GO

This application is based on simple **Akka HTTP** project: http://www.yoppworks.com/2016/08/24/blog/pokemon-go-with-akka-http/

**Seeing Pokemon**

To see current pokemons, go to:

    http://pokemon-go-akka-http.herokuapp.com/pokemons**Adding Pokemon**

**Adding Pokemons**
Send Http/POST request:

    curl -H 'Content-Type: application/json' -X POST -d '{"name": "monster"}' http://pokemon-go-akka-http.herokuapp.com/pokemons
    curl -H 'Content-Type: application/json' -X POST -d '{"name": "pikachu"}' http://pokemon-go-akka-http.herokuapp.com/pokemons
