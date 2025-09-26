package WebRobot.Cli.Sdk.custom;
import java.lang.reflect.ParameterizedType;

public class ExceptionResultFactory<T> {
    private Class<T> persistentClass;
    public ExceptionResultFactory() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
    public  T getInstance() throws IllegalAccessException,InstantiationException
    {
        return this.persistentClass.newInstance();
    }
}
