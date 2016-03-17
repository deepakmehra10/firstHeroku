
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminhomepage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class adminhomepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[repository.Interns],Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(internForm:Form[repository.Interns])(implicit flash:Flash,messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.79*/("""
"""),_display_(/*3.2*/main("adminhomepage")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<style>

</style>
<div class="container">
    <div class="row">
        <div class="col-md-1 col-md-offset-11">
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.UsersController.logout),format.raw/*11.52*/("""" style="margin-top:10px;"><button class="btn btn-success">Log out</button></a>
        </div>
    </div>
    <h2>Admin Homepage</h2>
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#home">Home</a></li>

        <li><a data-toggle="tab" href="#menu1" id="awards">Awards</a></li>
        <li><a data-toggle="tab" href="#menu2" id="language">Languages Known</a></li>
        <li><a data-toggle="tab" href="#menu3" id="assignment">Assignment</a></li>
        <li><a data-toggle="tab" href="#menu4" id="programming">Programming Language</a></li>
        <li><a data-toggle="tab" href="#menu5" id="intern">Intern Details</a></li>
    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <h3>HOME</h3>
            <p>HOME</p>
        </div>
        <div id="menu1" class="tab-pane fade">
            <h3>Awards</h3>
            <p>


            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Add Record</button>

            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add Awards</h4>
                        </div>
                        <div class="modal-body">
                            <p>


                            <form role="form">
                                <div class="form-group">
                                    <label for="sno">S.No</label>
                                    <input type="text" class="form-control" id="sno">
                                </div>
                                <div class="form-group">
                                    <label for="name">Name</label>
                                    <input type="text" class="form-control" id="name">
                                </div>

                            <div class="form-group">
                                <label for="detail">Detail</label>
                                <input type="text" class="form-control" id="detail">
                            </div>


                            <div class="form-group">
                                <label for="year">Year</label>
                                <input type="text" class="form-control" id="year">
                            </div>


                                <button type="submit" class="btn btn-default">Add</button>
                            </form>




                            </p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>

            </p>
        </div>
        <div id="menu2" class="tab-pane fade">
            <h3>Language Known</h3>
            <p>


            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal1">Add Record</button>

            <div class="modal fade" id="myModal1" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Languages Known</h4>
                        </div>
                        <div class="modal-body">
                            <p>


                            <form role="form">
                                <div class="form-group">
                                    <label for="sno1">S.No</label>
                                    <input type="text" class="form-control" id="sno1">
                                </div>
                                <div class="form-group">
                                    <label for="langname">Language-Name</label>
                                    <input type="text" class="form-control" id="langname">
                                </div>

                                <div class="form-group">
                                    <label for="fluency">Fluency</label>
                                    <input type="text" class="form-control" id="fluency">
                                </div>




                                <button type="submit" class="btn btn-default">Add</button>
                            </form>




                            </p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>


            </p>
        </div>
        <div id="menu3" class="tab-pane fade">
            <h3>Assignment</h3>
            <p>


            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">Add Record</button>

            <div class="modal fade" id="myModal2" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Assignments</h4>
                        </div>
                        <div class="modal-body">
                            <p>


                            <form role="form">
                                <div class="form-group">
                                    <label for="nameassgn">Name</label>
                                    <input type="text" class="form-control" id="nameassgn">
                                </div>
                                <div class="form-group">
                                    <label for="date">Date</label>
                                    <input type="date" class="form-control" id="date">
                                </div>

                                <div class="form-group">
                                    <label for="marks">Marks</label>
                                    <input type="text" class="form-control" id="marks">
                                </div>


                                <div class="form-group">
                                    <label for="remarks">Remarks</label>
                                    <input type="text" class="form-control" id="remarks">
                                </div>


                                <button type="submit" class="btn btn-default">Add</button>
                            </form>




                            </p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>



            </p>
        </div>
        <div id="menu4" class="tab-pane fade">
            <h3>Programming Language</h3>
            <p>




            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal3">Add Record</button>

            <div class="modal fade" id="myModal3" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Assignments</h4>
                        </div>
                        <div class="modal-body">
                            <p>


                            <form role="form">
                                <div class="form-group">
                                    <label for="sn">SNo.</label>
                                    <input type="text" class="form-control" id="sn">
                                </div>
                                <div class="form-group">
                                    <label for="lname">Language Name</label>
                                    <input type="text" class="form-control" id="lname">
                                </div>

                                <div class="form-group">
                                    <label for="eff">Efficiency</label>
                                    <input type="text" class="form-control" id="eff">
                                </div>




                                <button type="submit" class="btn btn-default">Add</button>
                            </form>




                            </p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>




            </p>
        </div>
        <div id="menu5" class="tab-pane fade">
            <h3>Intern Details</h3>
            <p>
                <div id="internRecord"></div>



            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal4">Add Record</button>

            <div class="modal fade" id="myModal4" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add Intern</h4>
                        </div>
                        <div class="modal-body">
                            <p>
                            <div class="alert alert-success message" style="display:none;">
                                <strong>Success!</strong>Intern has been successfully added.
                            </div>
                                """),_display_(/*293.34*/b3/*293.36*/.form(action=routes.UsersController.addInterns, 'id -> "myForm")/*293.100*/ {_display_(Seq[Any](format.raw/*293.102*/("""

                                """),_display_(/*295.34*/b3/*295.36*/.text( internForm("name"), '_label -> "Name",'placeholder -> "Enter InternName" )),format.raw/*295.117*/("""
                                """),_display_(/*296.34*/b3/*296.36*/.email( internForm("email"), '_label -> "Email",'placeholder -> "Enter Email" )),format.raw/*296.115*/("""
                                """),_display_(/*297.34*/b3/*297.36*/.number( internForm("mobile"), '_label -> "Mobile",'placeholder -> "Enter Mobile" )),format.raw/*297.119*/("""
                                """),_display_(/*298.34*/b3/*298.36*/.text( internForm("award"), '_label -> "Award",'placeholder -> "Enter Award" )),format.raw/*298.114*/("""



                                """),format.raw/*302.33*/("""<button type="submit" id="internadd" class="btn btn-default">Add</button>

                                """)))}),format.raw/*304.34*/("""


                            """),format.raw/*307.29*/("""<!--<form role="form">-->
                                <!--<div class="form-group">-->
                                    <!--<label for="internname">Name</label>-->
                                    <!--<input type="text" class="form-control" id="internname">-->
                                <!--</div>-->
                                <!--<div class="form-group">-->
                                    <!--<label for="email">Email</label>-->
                                    <!--<input type="email" class="form-control" id="email">-->
                                <!--</div>-->

                                <!--<div class="form-group">-->
                                    <!--<label for="mob">Mobile No.</label>-->
                                    <!--<input type="text" class="form-control" id="mob">-->
                                <!--</div>-->


                            <!--<div class="form-group">-->
                                <!--<label for="award">Award Details</label>-->
                                <!--<input type="text" class="form-control" id="award">-->
                            <!--</div>-->



                            <!--<button type="submit" class="btn btn-default">Add</button>-->
                            <!--</form>-->




                            </p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>





            </p>
        </div>
    </div>

</div>





<script>
    $(document).ready(function()"""),format.raw/*361.33*/("""{"""),format.raw/*361.34*/("""
    """),format.raw/*362.5*/("""$('#awards').click(function()"""),format.raw/*362.34*/("""{"""),format.raw/*362.35*/("""

    """),format.raw/*364.5*/("""$.get("/users/getawards",function(data,status)"""),format.raw/*364.51*/("""{"""),format.raw/*364.52*/("""
    """),format.raw/*365.5*/("""$('#menu1').html(data);
    """),format.raw/*366.5*/("""}"""),format.raw/*366.6*/(""");
    """),format.raw/*367.5*/("""}"""),format.raw/*367.6*/(""");

    """),format.raw/*369.5*/("""}"""),format.raw/*369.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*373.33*/("""{"""),format.raw/*373.34*/("""

    """),format.raw/*375.5*/("""$('#language').click(function()"""),format.raw/*375.36*/("""{"""),format.raw/*375.37*/("""

    """),format.raw/*377.5*/("""$.get("/users/getlanguage",function(data,status)"""),format.raw/*377.53*/("""{"""),format.raw/*377.54*/("""
    """),format.raw/*378.5*/("""$('#menu2').html(data);
    """),format.raw/*379.5*/("""}"""),format.raw/*379.6*/(""");
    """),format.raw/*380.5*/("""}"""),format.raw/*380.6*/(""");

    """),format.raw/*382.5*/("""}"""),format.raw/*382.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*386.33*/("""{"""),format.raw/*386.34*/("""
    """),format.raw/*387.5*/("""$('#assignment').click(function()"""),format.raw/*387.38*/("""{"""),format.raw/*387.39*/("""

    """),format.raw/*389.5*/("""$.get("/users/getassignment",function(data,status)"""),format.raw/*389.55*/("""{"""),format.raw/*389.56*/("""
    """),format.raw/*390.5*/("""$('#menu3').html(data);
    """),format.raw/*391.5*/("""}"""),format.raw/*391.6*/(""");
    """),format.raw/*392.5*/("""}"""),format.raw/*392.6*/(""");

    """),format.raw/*394.5*/("""}"""),format.raw/*394.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*398.33*/("""{"""),format.raw/*398.34*/("""
    """),format.raw/*399.5*/("""$('#programming').click(function()"""),format.raw/*399.39*/("""{"""),format.raw/*399.40*/("""

    """),format.raw/*401.5*/("""$.get("/users/getprogramming",function(data,status)"""),format.raw/*401.56*/("""{"""),format.raw/*401.57*/("""
    """),format.raw/*402.5*/("""$('#menu4').html(data);
    """),format.raw/*403.5*/("""}"""),format.raw/*403.6*/(""");
    """),format.raw/*404.5*/("""}"""),format.raw/*404.6*/(""");

    """),format.raw/*406.5*/("""}"""),format.raw/*406.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*410.33*/("""{"""),format.raw/*410.34*/("""
    """),format.raw/*411.5*/("""$('#intern').click(function()"""),format.raw/*411.34*/("""{"""),format.raw/*411.35*/("""

    """),format.raw/*413.5*/("""$.get("/users/getintern",function(data,status)"""),format.raw/*413.51*/("""{"""),format.raw/*413.52*/("""
    """),format.raw/*414.5*/("""$('#internRecord').html(data);
    """),format.raw/*415.5*/("""}"""),format.raw/*415.6*/(""");
    """),format.raw/*416.5*/("""}"""),format.raw/*416.6*/(""");

    """),format.raw/*418.5*/("""}"""),format.raw/*418.6*/(""");
</script>



<script>


    $(document).ready(function()"""),format.raw/*426.33*/("""{"""),format.raw/*426.34*/("""

 """),format.raw/*428.2*/("""$('form').submit(function(e)"""),format.raw/*428.30*/("""{"""),format.raw/*428.31*/("""
"""),format.raw/*429.1*/("""e.preventDefault();
$form=$(this);
$.post('"""),_display_(/*431.10*/routes/*431.16*/.UsersController.addInterns),format.raw/*431.43*/("""',$(this).serialize(),function(data)"""),format.raw/*431.79*/("""{"""),format.raw/*431.80*/("""

"""),format.raw/*433.1*/("""$('.message').fadeIn(3000);
$('#myForm')[0].reset();
"""),format.raw/*435.1*/("""}"""),format.raw/*435.2*/(""");


"""),format.raw/*438.1*/("""}"""),format.raw/*438.2*/(""");
    """),format.raw/*439.5*/("""}"""),format.raw/*439.6*/(""");
</script>





""")))}))
      }
    }
  }

  def render(internForm:Form[repository.Interns],flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(internForm)(flash,messages)

  def f:((Form[repository.Interns]) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (internForm) => (flash,messages) => apply(internForm)(flash,messages)

  def ref: this.type = this

}


}

/**/
object adminhomepage extends adminhomepage_Scope0.adminhomepage
              /*
                  -- GENERATED --
                  DATE: Sun Mar 13 01:14:53 IST 2016
                  SOURCE: /home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/app/views/adminhomepage.scala.html
                  HASH: 1e3f8d15b31467d9548932f5de307b7dcaa174f4
                  MATRIX: 576->1|783->78|810->117|839->138|877->139|905->141|1066->275|1081->281|1125->304|11770->10921|11782->10923|11857->10987|11899->10989|11962->11024|11974->11026|12078->11107|12140->11141|12152->11143|12254->11222|12316->11256|12328->11258|12434->11341|12496->11375|12508->11377|12609->11455|12674->11491|12814->11599|12874->11630|14631->13358|14661->13359|14694->13364|14752->13393|14782->13394|14816->13400|14891->13446|14921->13447|14954->13452|15010->13480|15039->13481|15074->13488|15103->13489|15139->13497|15168->13498|15252->13553|15282->13554|15316->13560|15376->13591|15406->13592|15440->13598|15517->13646|15547->13647|15580->13652|15636->13680|15665->13681|15700->13688|15729->13689|15765->13697|15794->13698|15878->13753|15908->13754|15941->13759|16003->13792|16033->13793|16067->13799|16146->13849|16176->13850|16209->13855|16265->13883|16294->13884|16329->13891|16358->13892|16394->13900|16423->13901|16507->13956|16537->13957|16570->13962|16633->13996|16663->13997|16697->14003|16777->14054|16807->14055|16840->14060|16896->14088|16925->14089|16960->14096|16989->14097|17025->14105|17054->14106|17138->14161|17168->14162|17201->14167|17259->14196|17289->14197|17323->14203|17398->14249|17428->14250|17461->14255|17524->14290|17553->14291|17588->14298|17617->14299|17653->14307|17682->14308|17770->14367|17800->14368|17831->14371|17888->14399|17918->14400|17947->14401|18019->14445|18035->14451|18084->14478|18149->14514|18179->14515|18209->14517|18290->14570|18319->14571|18352->14576|18381->14577|18416->14584|18445->14585
                  LINES: 20->1|25->1|26->3|26->3|26->3|28->5|34->11|34->11|34->11|316->293|316->293|316->293|316->293|318->295|318->295|318->295|319->296|319->296|319->296|320->297|320->297|320->297|321->298|321->298|321->298|325->302|327->304|330->307|384->361|384->361|385->362|385->362|385->362|387->364|387->364|387->364|388->365|389->366|389->366|390->367|390->367|392->369|392->369|396->373|396->373|398->375|398->375|398->375|400->377|400->377|400->377|401->378|402->379|402->379|403->380|403->380|405->382|405->382|409->386|409->386|410->387|410->387|410->387|412->389|412->389|412->389|413->390|414->391|414->391|415->392|415->392|417->394|417->394|421->398|421->398|422->399|422->399|422->399|424->401|424->401|424->401|425->402|426->403|426->403|427->404|427->404|429->406|429->406|433->410|433->410|434->411|434->411|434->411|436->413|436->413|436->413|437->414|438->415|438->415|439->416|439->416|441->418|441->418|449->426|449->426|451->428|451->428|451->428|452->429|454->431|454->431|454->431|454->431|454->431|456->433|458->435|458->435|461->438|461->438|462->439|462->439
                  -- GENERATED --
              */
          