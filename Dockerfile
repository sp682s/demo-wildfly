 FROM jboss/wildfly:21.0.2.Final
 ADD target/wildfly.war /opt/jboss/wildfly/standalone/deployments/