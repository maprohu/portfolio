package portfolio

/**
  * Created by pappmar on 31/08/2016.
  */
object Skills {

  object Java
  object J2SE
  object JavaSwing
  object JDBC
  object MSSQL
  object Tomcat
  object Hibernate
  object XML
  object XSL
  object HTML
  object JavaScript
  object PostgreSQL
  object WebsphereMQ
  object WebsphereApplicationServer
  object WebServices
  object JMS
  object J2EE
  object GWT
  object Spring
  object Maven


}

object Projects {
  import Skills._

  object MaproAnest {
    Seq(
      Java,
      JavaSwing,
      JDBC,
      MSSQL
    )
  }

  object MaproFrameworkAssixo {
    Seq(
      Java,
      Tomcat,
      Hibernate,
      XML,
      XSL,
      HTML,
      JavaScript,
      PostgreSQL
    )
  }

  object Trask {
    Seq(
      Java,
      Maven,
      WebsphereMQ,
      WebsphereApplicationServer,
      WebServices,
      JMS,
      J2EE
    )
  }


  object MaprohuFrameworkGwt {
    Seq(
      Java,
      GWT,
      Spring,
      Hibernate
    )
  }

  object MagicRoller

  object EMSA



}
