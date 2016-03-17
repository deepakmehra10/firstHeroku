
package views.html.adminDashboard

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object assignmentTable_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class assignmentTable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[repository.Assignment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listOfAssignment:List[repository.Assignment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<h1>List of Assignment </h1>
<p>
<table class="table table-striped">
    <thead>
    <tr>
        <th>S.no.</th>
        <th>Student Name</th>
        <th>Assignment Name</th>
        <th>Date</th>
        <th>Marks</th>
        <th>Remarks</th>
    </tr>
    </thead>
    <tbody>

    """),_display_(/*18.6*/for(items <- listOfAssignment ) yield /*18.37*/{_display_(Seq[Any](format.raw/*18.38*/("""
    """),format.raw/*19.5*/("""<tr>
        <td>"""),_display_(/*20.14*/items/*20.19*/.sno),format.raw/*20.23*/("""</td>
        <td>"""),_display_(/*21.14*/items/*21.19*/.studname),format.raw/*21.28*/("""</td>
        <td>"""),_display_(/*22.14*/items/*22.19*/.name),format.raw/*22.24*/("""</td>
        <td>"""),_display_(/*23.14*/items/*23.19*/.date),format.raw/*23.24*/("""</td>
        <td>"""),_display_(/*24.14*/items/*24.19*/.marks),format.raw/*24.25*/("""</td>
        <td>"""),_display_(/*25.14*/items/*25.19*/.remarks),format.raw/*25.27*/("""</td>
    </tr>


    """)))}),format.raw/*29.6*/("""
    """),format.raw/*30.5*/("""</tbody>
</table>
</p>
"""))
      }
    }
  }

  def render(listOfAssignment:List[repository.Assignment]): play.twirl.api.HtmlFormat.Appendable = apply(listOfAssignment)

  def f:((List[repository.Assignment]) => play.twirl.api.HtmlFormat.Appendable) = (listOfAssignment) => apply(listOfAssignment)

  def ref: this.type = this

}


}

/**/
object assignmentTable extends assignmentTable_Scope0.assignmentTable
              /*
                  -- GENERATED --
                  DATE: Sat Mar 12 23:27:27 IST 2016
                  SOURCE: /home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/app/views/adminDashboard/assignmentTable.scala.html
                  HASH: 2e5eab225777a968ef8565484ea29b2638c306ba
                  MATRIX: 583->1|724->47|752->49|1065->336|1112->367|1151->368|1183->373|1228->391|1242->396|1267->400|1313->419|1327->424|1357->433|1403->452|1417->457|1443->462|1489->481|1503->486|1529->491|1575->510|1589->515|1616->521|1662->540|1676->545|1705->553|1758->576|1790->581
                  LINES: 20->1|25->1|27->3|42->18|42->18|42->18|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|53->29|54->30
                  -- GENERATED --
              */
          