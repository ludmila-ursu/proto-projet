package proto_projet.mvn;

public enum FactoryEnum implements Factory<Employee>{
    ADMINISTATOR_TYPE{
        @Override
        public Employee create (String name, String gender, int birthYear, int salary, String function){
            return new Administrator(name, gender, birthYear, salary, function);
        };
    },
    PROFESSOR_TYPE{
            @Override
            public Employee create (String name, String gender, int birthYear, int salary, String function){
            return new Professor(name, gender, birthYear, salary, function);
        };
    };
}
