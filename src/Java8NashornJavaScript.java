/**
 * With Java 8, Nashorn, a much improved javascript engine is introduced, to replace the existing Rhino.
 * Nashorn provides 2 to 10 times better performance, as it directly compiles the code in memory and passes the bytecode to JVM.
 * So used NashornJavaScript when need to see the java script output on the server side in backend, when usually its only the java code in the server/backend
 * So using NashornJavaScript instead of running on the client, can run the javascript on the server
 */

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Java8NashornJavaScript {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "Bestseller";
        Integer result = null;
        Object result1 = null;

        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("2 + 2");
            result1 = nashorn.eval(
                    "var greeting='hello Java 8';" +
                            "print(greeting);");

        } catch(ScriptException e) {
            System.out.println("Error executing script: "+ e.getMessage());
        }
        System.out.println(result.toString());


    }

}

