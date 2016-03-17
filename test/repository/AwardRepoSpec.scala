package repository

import org.specs2.mutable.Specification
import play.api.Application
import play.api.test.WithApplication
import scala.concurrent.duration._
import scala.concurrent.Await

/**
  * Created by akshay on 10/3/16.
  */
class AwardRepoSpec extends Specification{


  "Award repository" should {
    def awardRepo(implicit app: Application) = Application.instanceCache[AwardRepo].apply(app)

    "Get all awards records test" in new WithApplication {
      val result = Await.result(awardRepo.getAllAwards(), 5 seconds)
      assert(result.length === 2)
      assert(result === List(Awards(1,"akshay","Lan game First Prize",2016),Awards(2,"deepak","Coding First Prize",2016)))
    }

    "Add award test" in new WithApplication {
      val result = Await.result(awardRepo.addAwards(Awards(3,"sangeeta","first division",2016)), 5 seconds)
      assert(result === 1)
    }

    "Get award record test" in new WithApplication {
      val result = Await.result(awardRepo.getUserAwards("akshay"), 5 seconds)
      assert(result.length === 1)
      assert(result === List(Awards(1,"akshay","Lan game First Prize",2016)))
    }
  }
}