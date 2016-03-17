
package views.html.adminDashboard

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object internTable_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class internTable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[repository.Interns],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listOfInterns:List[repository.Interns]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<h1>List of Interns </h1>
<p>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Name</th>
        <th>Student Email</th>
        <th>Contact Number</th>
        <th>Award Details</th>
    </tr>
    </thead>
    <tbody>

    """),_display_(/*16.6*/for(items <- listOfInterns ) yield /*16.34*/{_display_(Seq[Any](format.raw/*16.35*/("""

    """),format.raw/*18.5*/("""<tr>
        <td>"""),_display_(/*19.14*/items/*19.19*/.name),format.raw/*19.24*/("""</td>
        <td>"""),_display_(/*20.14*/items/*20.19*/.email),format.raw/*20.25*/("""</td>
        <td>"""),_display_(/*21.14*/items/*21.19*/.mobile),format.raw/*21.26*/("""</td>
        <td>"""),_display_(/*22.14*/items/*22.19*/.award),format.raw/*22.25*/("""</td>
        <td><button class="btn btn-primary">Edit</button></td>

        <td><button class="btn btn-danger" id="">Delete</button></td>
    </tr>


    """)))}),format.raw/*29.6*/("""
    """),format.raw/*30.5*/("""</tbody>
</table>
</p>"""))
      }
    }
  }

  def render(listOfInterns:List[repository.Interns]): play.twirl.api.HtmlFormat.Appendable = apply(listOfInterns)

  def f:((List[repository.Interns]) => play.twirl.api.HtmlFormat.Appendable) = (listOfInterns) => apply(listOfInterns)

  def ref: this.type = this

}


}

/**/
object internTable extends internTable_Scope0.internTable
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 11:14:39 IST 2016
                  SOURCE: /home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/app/views/adminDashboard/internTable.scala.html
                  HASH: c81dc9be6b6961b5aee877ab6ae3a5b89bf5885b
                  MATRIX: 572->1|707->41|735->43|1005->287|1049->315|1088->316|1121->322|1166->340|1180->345|1206->350|1252->369|1266->374|1293->380|1339->399|1353->404|1381->411|1427->430|1441->435|1468->441|1655->598|1687->603
                  LINES: 20->1|25->1|27->3|40->16|40->16|40->16|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|53->29|54->30
                  -- GENERATED --
              */
          