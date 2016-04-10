# dota2-api-java
Java library to access Dota2 API

Simple usage example
```java
  ApiConfig config = new ApiConfig().setApiKey("YOUR-API-KEY-HERE");
  Dota2Client client = new Dota2Client(config);

  List<League> leagues = client.getLeagueApiCalls()
          .getLeagueListing()
          .getLeagues();

  List<LiveGame> games = client.getLeagueApiCalls()
          .getLiveLeagueGames()
          .getLiveGames();
```
