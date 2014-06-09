. ./setEnv.sh
java -Dij.driver=org.apache.derby.jdbc.ClientDriver -Dij.user=guest -Dij.password=password -Dij.database=jdbc:derby:BatchRepository org.apache.derby.tools.ij
