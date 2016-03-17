
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[UsersData],Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm:Form[UsersData])(implicit flash:Flash,messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("signup")/*4.16*/{_display_(Seq[Any](format.raw/*4.17*/("""
"""),format.raw/*5.1*/("""<style>
.container"""),format.raw/*6.11*/("""{"""),format.raw/*6.12*/("""
    """),format.raw/*7.5*/("""background-image:url("""),_display_(/*7.27*/routes/*7.33*/.Assets.versioned("images/login.jpg")),format.raw/*7.70*/(""");
    """),format.raw/*8.5*/("""}"""),format.raw/*8.6*/("""

    """),format.raw/*10.5*/("""form"""),format.raw/*10.9*/("""{"""),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""font-family: 'Arimo', sans-serif;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/(""".header
    """),format.raw/*14.5*/("""{"""),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""font-family: 'Arimo', sans-serif;
    background-color:#4E004E;
    color:white;
    font-size:30px;
    padding:10px;
    border-radius:2px;
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/("""
"""),format.raw/*22.1*/("""</style>
<div>
    """),_display_(/*24.6*/if(flash.get("error").isDefined)/*24.38*/{_display_(Seq[Any](format.raw/*24.39*/("""
    """),format.raw/*25.5*/("""<div class="alert alert-danger">
        <strong>"""),_display_(/*26.18*/flash/*26.23*/.get("error")),format.raw/*26.36*/("""</strong>
    </div>
    """)))}),format.raw/*28.6*/("""
"""),format.raw/*29.1*/("""</div>
<div class="container">
    <div class="row header">
        <div class="col-md-12">
            SignUp
        </div>
    </div>
    <div class="row">
    <div class="col-md-4 col-md-offset-4 " >
        """),_display_(/*38.10*/b3/*38.12*/.form(routes.UsersController.renderSignUp)/*38.54*/ {_display_(Seq[Any](format.raw/*38.56*/("""

        """),_display_(/*40.10*/b3/*40.12*/.text( signupForm("username"), '_label -> "User Name",'placeholder -> "Enter UserName" )),format.raw/*40.100*/("""
        """),_display_(/*41.10*/b3/*41.12*/.text( signupForm("email"), '_label -> "Email", 'placeholder -> "Enter Email Address" )),format.raw/*41.99*/("""
        """),_display_(/*42.10*/b3/*42.12*/.password( signupForm("password"), '_label -> "Password", 'placeholder -> "Enter password" )),format.raw/*42.104*/("""
        """),_display_(/*43.10*/b3/*43.12*/.password( signupForm("repassword"), '_label -> "Re-Password", 'placeholder -> "Re-enter password" )),format.raw/*43.112*/("""

        """),_display_(/*45.10*/b3/*45.12*/.submit('class -> "btn btn-primary")/*45.48*/{_display_(Seq[Any](format.raw/*45.49*/(""" """),format.raw/*45.50*/("""Sign Up Now """)))}),format.raw/*45.63*/("""

        """)))}),format.raw/*47.10*/("""
    """),format.raw/*48.5*/("""</div>
</div>
</div>
""")))}))
      }
    }
  }

  def render(signupForm:Form[UsersData],flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)(flash,messages)

  def f:((Form[UsersData]) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => (flash,messages) => apply(signupForm)(flash,messages)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Sat Mar 12 23:27:27 IST 2016
                  SOURCE: /home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/app/views/signup.scala.html
                  HASH: 19a2940d5b3ba8f0ba2302293938e2d72f1382bc
                  MATRIX: 553->1|751->69|778->107|805->109|827->123|865->124|892->125|937->143|965->144|996->149|1044->171|1058->177|1115->214|1148->221|1175->222|1208->228|1239->232|1268->233|1300->238|1365->276|1393->277|1425->282|1464->294|1492->295|1524->300|1697->446|1725->447|1753->448|1799->468|1840->500|1879->501|1911->506|1988->556|2002->561|2036->574|2092->600|2120->601|2360->814|2371->816|2422->858|2462->860|2500->871|2511->873|2621->961|2658->971|2669->973|2777->1060|2814->1070|2825->1072|2939->1164|2976->1174|2987->1176|3109->1276|3147->1287|3158->1289|3203->1325|3242->1326|3271->1327|3315->1340|3357->1351|3389->1356
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|28->5|29->6|29->6|30->7|30->7|30->7|30->7|31->8|31->8|33->10|33->10|33->10|34->11|35->12|35->12|36->13|37->14|37->14|38->15|44->21|44->21|45->22|47->24|47->24|47->24|48->25|49->26|49->26|49->26|51->28|52->29|61->38|61->38|61->38|61->38|63->40|63->40|63->40|64->41|64->41|64->41|65->42|65->42|65->42|66->43|66->43|66->43|68->45|68->45|68->45|68->45|68->45|68->45|70->47|71->48
                  -- GENERATED --
              */
          