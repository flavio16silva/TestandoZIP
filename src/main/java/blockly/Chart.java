package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Chart {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Chart
public static Var generateChart() throws Exception {
 return new Callable<Var>() {

   private Var i = Var.VAR_NULL;
   private Var f = Var.VAR_NULL;

   public Var call() throws Exception {

    i =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.inicio"));

    f =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.fim"));

    cronapi.chart.Operations.createChart(
    Var.valueOf("chart5884"),
    Var.valueOf("bar"),
    cronapi.conversion.Operations.convert(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select a.ano from Anime a  group by a.ano  order by a.ano asc")),
    Var.valueOf("LIST")),
    Var.valueOf("{\n    \"title\": {\n                \"display\": true,\n                \"text\": \"Animes assistidos por ano\",\n                \"fontSize\": 20,\n                \"fontColor\": \"#00F\"\n    },\n         \n    \"legend\": {\n                \"display\": true\n    },\n     \n    \"animation\": {\n                \"duration\": 1500,\n                \"easing\": \"easeOutBounce\"\n    },\n     \n    \"layout\": {\n                \"padding\": {\n                    \"left\": 120,\n                    \"right\": 120,\n                    \"top\": 60,\n                    \"bottom\": 60\n                }\n    }\n}"),
    cronapi.chart.Operations.createChartSerie(
    Var.valueOf("Qtd lançadas"),
    cronapi.conversion.Operations.convert(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select COUNT(a.anime) from Anime a where a.anime = \'Era do Gelo\' AND a.episodio BETWEEN :i AND :f group by a.ano  order by a.ano asc"),Var.valueOf("i",i),Var.valueOf("f",f)),
    Var.valueOf("LIST")), Var.VAR_NULL),
    cronapi.chart.Operations.createChartSerie(
    Var.valueOf("Testando"),
    cronapi.conversion.Operations.convert(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select COUNT(a.episodio) from Anime a where a.anime = \'Caindo\' AND a.episodio BETWEEN :i AND :f group by a.ano  order by a.ano asc"),Var.valueOf("i",i),Var.valueOf("f",f)),
    Var.valueOf("LIST")), Var.VAR_NULL),
    cronapi.chart.Operations.createChartSerie(
    Var.valueOf("Ordenando"),
    cronapi.conversion.Operations.convert(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select COUNT(a.ano) from Anime a where a.anime = \'Chuva\' AND a.episodio BETWEEN :i AND :f group by a.ano  order by a.ano asc"),Var.valueOf("i",i),Var.valueOf("f",f)),
    Var.valueOf("LIST")), Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Chart
public static Var generateChartDinamico() throws Exception {
 return new Callable<Var>() {

   private Var linkExemplo = Var.VAR_NULL;
   private Var consultalegendas = Var.VAR_NULL;
   private Var consultavalores = Var.VAR_NULL;
   private Var listalegendas = Var.VAR_NULL;
   private Var listavalores = Var.VAR_NULL;

   public Var call() throws Exception {

    // Link no qual me baseei para montar as listagens com quantidade fixa.
    linkExemplo =
    Var.valueOf("https://docs.cronapp.io/display/CRON2/cronapi.chart.Operations.createChartSerie");

    consultalegendas =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select cast(a.ano as varchar) from Anime a  group by a.ano  order by a.ano asc"));

    consultavalores =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select COUNT(a.anime) from Anime a  group by a.ano  order by a.ano asc"));

    listalegendas =
    cronapi.list.Operations.getTextFromList(consultalegendas,
    Var.valueOf(","));

    listavalores =
    cronapi.list.Operations.getTextFromList(consultavalores,
    Var.valueOf(","));

    cronapi.chart.Operations.createChart(
    Var.valueOf("chartAnimeConsulta"),
    Var.valueOf("bar"),
    cronapi.list.Operations.getListFromText(listalegendas,
    Var.valueOf(",")), Var.VAR_NULL,
    cronapi.chart.Operations.createChartSerie(
    Var.valueOf("Quantidade"),
    cronapi.list.Operations.getListFromText(listavalores,
    Var.valueOf(",")), Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Chart
public static Var generateChartFixo() throws Exception {
 return new Callable<Var>() {

   private Var linkExemplo = Var.VAR_NULL;
   private Var consultalegendas = Var.VAR_NULL;
   private Var consultavalores = Var.VAR_NULL;
   private Var listalegendas = Var.VAR_NULL;
   private Var listavalores = Var.VAR_NULL;

   public Var call() throws Exception {

    // Link no qual me baseei para montar as listagens com quantidade fixa.
    linkExemplo =
    Var.valueOf("https://docs.cronapp.io/display/CRON2/cronapi.chart.Operations.createChartSerie");

    consultalegendas =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select cast(a.ano as varchar) from Anime a  group by a.ano  order by a.ano asc"));

    consultavalores =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select COUNT(a.anime) from Anime a  group by a.ano  order by a.ano asc"));

    listalegendas =
    cronapi.list.Operations.newListRepeat(
    Var.valueOf(""),
    Var.valueOf(3));

    listavalores =
    cronapi.list.Operations.newListRepeat(
    Var.valueOf(""),
    Var.valueOf(3));

    if (
    cronapi.database.Operations.hasElement(consultalegendas).getObjectAsBoolean()) {

        cronapi.list.Operations.set(listalegendas,(
        Var.valueOf(1)),
        cronapi.database.Operations.getField(consultalegendas,
        Var.valueOf("this[0]")));

        cronapi.database.Operations.next(consultalegendas);

        cronapi.list.Operations.set(listalegendas,(
        Var.valueOf(2)),
        cronapi.database.Operations.getField(consultalegendas,
        Var.valueOf("this[0]")));

        cronapi.database.Operations.next(consultalegendas);

        cronapi.list.Operations.set(listalegendas,(
        Var.valueOf(3)),
        cronapi.database.Operations.getField(consultalegendas,
        Var.valueOf("this[0]")));

        cronapi.database.Operations.next(consultalegendas);
    }

    if (
    cronapi.database.Operations.hasElement(consultavalores).getObjectAsBoolean()) {

        cronapi.list.Operations.set(listavalores,(
        Var.valueOf(1)),
        cronapi.database.Operations.getField(consultavalores,
        Var.valueOf("this[0]")));

        cronapi.database.Operations.next(consultavalores);

        cronapi.list.Operations.set(listavalores,(
        Var.valueOf(2)),
        cronapi.database.Operations.getField(consultavalores,
        Var.valueOf("this[0]")));

        cronapi.database.Operations.next(consultavalores);

        cronapi.list.Operations.set(listavalores,(
        Var.valueOf(3)),
        cronapi.database.Operations.getField(consultavalores,
        Var.valueOf("this[0]")));

        cronapi.database.Operations.next(consultavalores);
    }

    cronapi.chart.Operations.createChart(
    Var.valueOf("chartAnime"),
    Var.valueOf("bar"),
    cronapi.list.Operations.newList(
    cronapi.list.Operations.get(listalegendas,
    Var.valueOf(1)),
    cronapi.list.Operations.get(listalegendas,
    Var.valueOf(2)),
    cronapi.list.Operations.get(listalegendas,
    Var.valueOf(3))), Var.VAR_NULL,
    cronapi.list.Operations.newList(
    cronapi.list.Operations.get(listavalores,
    Var.valueOf(1)),
    cronapi.list.Operations.get(listavalores,
    Var.valueOf(2)),
    cronapi.list.Operations.get(listavalores,
    Var.valueOf(3))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Chart
public static Var generateChartFixoDocumentacao() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.chart.Operations.createChart(
    Var.valueOf("chartAnime"),
    Var.valueOf("bar"),
    cronapi.list.Operations.newList(
    Var.valueOf("Julho"),
    Var.valueOf("Agosto"),
    Var.valueOf("Setembro")), Var.VAR_NULL,
    cronapi.chart.Operations.createChartSerie(
    Var.valueOf("Chocolate"),
    cronapi.list.Operations.newList(
    Var.valueOf("20170"),
    Var.valueOf("22650"),
    Var.valueOf("20365")), Var.VAR_NULL),
    cronapi.chart.Operations.createChartSerie(
    Var.valueOf("Jujuba"),
    cronapi.list.Operations.newList(
    Var.valueOf("13060"),
    Var.valueOf("14060"),
    Var.valueOf("15060")), Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

}

