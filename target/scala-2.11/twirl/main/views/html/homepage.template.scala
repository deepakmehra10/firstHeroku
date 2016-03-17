
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object homepage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("homepage")/*1.18*/{_display_(Seq[Any](format.raw/*1.19*/("""


"""),format.raw/*4.1*/("""<div class="container">

    <div class="row">
        <div class="col-md-1 col-md-offset-11">
            <a href=""""),_display_(/*8.23*/routes/*8.29*/.UsersController.logout),format.raw/*8.52*/("""" style="margin-top:10px;"><button class="btn btn-success">Log out</button></a>
        </div>
    </div>



    <h2>User Homepage</h2>
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#home">Home</a></li>

        <li><a data-toggle="tab" href="#menu1" id="awards">Awards</a></li>
        <li><a data-toggle="tab" href="#menu2" id="language">Languages Known</a></li>
        <li><a data-toggle="tab" href="#menu3" id="assignment">Assignment</a></li>
        <li><a data-toggle="tab" href="#menu4" id="programming">Programming Language</a></li>
    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <h3>HOME</h3>
            <p>HOME</p>
        </div>
        <div id="menu1" class="tab-pane fade">
            <h3>Awards</h3>
            <p>Awards</p>

        </div>
        <div id="menu2" class="tab-pane fade">
            <h3>Language Known</h3>
            <p>Language</p>
        </div>
        <div id="menu3" class="tab-pane fade">
            <h3>Assignment</h3>
            <p>Assignment</p>
        </div>
        <div id="menu4" class="tab-pane fade">
            <h3>Programming Language</h3>
            <p>Programming</p>
        </div>
    </div>

<button id="hi">hi</button>
</div>

<script>
    $(document).ready(function()"""),format.raw/*52.33*/("""{"""),format.raw/*52.34*/("""
    """),format.raw/*53.5*/("""$('#awards').click(function()"""),format.raw/*53.34*/("""{"""),format.raw/*53.35*/("""

    """),format.raw/*55.5*/("""$.get("/users/getuserawards",function(data,status)"""),format.raw/*55.55*/("""{"""),format.raw/*55.56*/("""
    """),format.raw/*56.5*/("""$('#menu1').html(data);
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""");
    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/(""");

    """),format.raw/*60.5*/("""}"""),format.raw/*60.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*64.33*/("""{"""),format.raw/*64.34*/("""
    """),format.raw/*65.5*/("""$('#assignment').click(function()"""),format.raw/*65.38*/("""{"""),format.raw/*65.39*/("""

    """),format.raw/*67.5*/("""$.get("/users/getuserassignment",function(data,status)"""),format.raw/*67.59*/("""{"""),format.raw/*67.60*/("""
    """),format.raw/*68.5*/("""$('#menu2').html(data);
    """),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""");
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/(""");

    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*76.33*/("""{"""),format.raw/*76.34*/("""
    """),format.raw/*77.5*/("""$('#language').click(function()"""),format.raw/*77.36*/("""{"""),format.raw/*77.37*/("""

    """),format.raw/*79.5*/("""$.get("/users/getuserlanguage",function(data,status)"""),format.raw/*79.57*/("""{"""),format.raw/*79.58*/("""
    """),format.raw/*80.5*/("""$('#menu3').html(data);
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""");

    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*88.33*/("""{"""),format.raw/*88.34*/("""
    """),format.raw/*89.5*/("""$('#programming').click(function()"""),format.raw/*89.39*/("""{"""),format.raw/*89.40*/("""

    """),format.raw/*91.5*/("""$.get("/users/getuserprogramming",function(data,status)"""),format.raw/*91.60*/("""{"""),format.raw/*91.61*/("""
    """),format.raw/*92.5*/("""$('#menu4').html(data);
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/(""");
    """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/(""");

    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""");
</script>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object homepage extends homepage_Scope0.homepage
              /*
                  -- GENERATED --
                  DATE: Sat Mar 12 23:27:27 IST 2016
                  SOURCE: /home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/app/views/homepage.scala.html
                  HASH: fe9e0dfc6435a747a6ac6a06d680fcd2ffe9853e
                  MATRIX: 615->1|639->17|677->18|706->21|849->138|863->144|906->167|2267->1500|2296->1501|2328->1506|2385->1535|2414->1536|2447->1542|2525->1592|2554->1593|2586->1598|2641->1626|2669->1627|2703->1634|2731->1635|2766->1643|2794->1644|2877->1699|2906->1700|2938->1705|2999->1738|3028->1739|3061->1745|3143->1799|3172->1800|3204->1805|3259->1833|3287->1834|3321->1841|3349->1842|3384->1850|3412->1851|3495->1906|3524->1907|3556->1912|3615->1943|3644->1944|3677->1950|3757->2002|3786->2003|3818->2008|3873->2036|3901->2037|3935->2044|3963->2045|3998->2053|4026->2054|4109->2109|4138->2110|4170->2115|4232->2149|4261->2150|4294->2156|4377->2211|4406->2212|4438->2217|4493->2245|4521->2246|4555->2253|4583->2254|4618->2262|4646->2263
                  LINES: 25->1|25->1|25->1|28->4|32->8|32->8|32->8|76->52|76->52|77->53|77->53|77->53|79->55|79->55|79->55|80->56|81->57|81->57|82->58|82->58|84->60|84->60|88->64|88->64|89->65|89->65|89->65|91->67|91->67|91->67|92->68|93->69|93->69|94->70|94->70|96->72|96->72|100->76|100->76|101->77|101->77|101->77|103->79|103->79|103->79|104->80|105->81|105->81|106->82|106->82|108->84|108->84|112->88|112->88|113->89|113->89|113->89|115->91|115->91|115->91|116->92|117->93|117->93|118->94|118->94|120->96|120->96
                  -- GENERATED --
              */
          