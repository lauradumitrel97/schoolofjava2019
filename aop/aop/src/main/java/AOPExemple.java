import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class AOPExemple {
    //inainte de metoda display sa apara numele metodei
//    @Before("execution(* Student.display())")
//    public void before(JoinPoint jp){
//        System.out.println(jp.getSignature().getName());
//    }

    @Pointcut("execution(* Student.display())")
    public void getPointcut(){}

    @Before("getPointcut()")
    public void before(JoinPoint jp){
        System.out.println(jp.getSignature().getName());
    }

    @After("execution(* Student.*(..))")
    public void after(JoinPoint jp){
        System.out.println("afara ploua linistit");
    }

    @Around("execution(* Student.*(..))")
    public void around(ProceedingJoinPoint jp){
        System.out.println("before " + jp.getSignature().getName());
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after");
    }

    @Before("execution(* Student.*(String))")
    public void beforeString(JoinPoint jp){
        System.out.println(jp.getSignature().getName() + " metoda cu string");
    }

    @Before("execution(* Student.*(String)) || execution(* Student.*(Integer))")
    public void beforeMethod(JoinPoint jp){
        System.out.println(jp.getSignature().getName() + " metoda cu string/int");
    }
}
