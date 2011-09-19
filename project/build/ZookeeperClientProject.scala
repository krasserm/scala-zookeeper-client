import sbt._

class ZookeeperClientProject(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {
  // Main dependencies
  val zookeeper = "org.apache.zookeeper" % "zookeeper" % "3.3.3"
  val configgy  = "net.lag"              % "configgy"  % "2.0.0"

  // Test dependencies
  val specs = "org.scala-tools.testing" % "specs_2.8.1" % "1.6.6" % "test"

  override def ivyXML = {
    <dependencies>
      <exclude module="mail" />
      <exclude module="jms" />
      <exclude module="jmxtools" />
      <exclude module="jmxri" />
      <exclude module="vscaladoc" />
    </dependencies>
  }
}
