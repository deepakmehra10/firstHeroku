
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div>
    <ul>
        <li ng-repeat=" name in names">"""),format.raw/*3.40*/("""{"""),format.raw/*3.41*/("""{"""),format.raw/*3.42*/("""name"""),format.raw/*3.46*/("""}"""),format.raw/*3.47*/("""}"""),format.raw/*3.48*/("""</li>
    </ul>
    </div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Tue Mar 15 17:49:31 IST 2016
                  SOURCE: /home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/app/views/test.scala.html
                  HASH: bda3ebf761aa4f2d43553e91ab582a0ed2e6c3f9
                  MATRIX: 607->0|688->54|716->55|744->56|775->60|803->61|831->62
                  LINES: 25->1|27->3|27->3|27->3|27->3|27->3|27->3
                  -- GENERATED --
              */
          