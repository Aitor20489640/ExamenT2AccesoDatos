package examenbbdd;

import examenbbdd.models.Departamento;
import examenbbdd.repository.impl.RepoManagerImpl;

public class ClienteBd {
    public static void main(String[] args) {
        RepoManagerImpl manager = new RepoManagerImpl();

        System.out.println("\nMostrar todas");
        System.out.println("-------------------------------");
        manager.getDepartamentoRepository().findAll().forEach(System.out::println);

        System.out.println("\nMostrar solo una");
        System.out.println("-------------------------------");
        System.out.println(manager.getDepartamentoRepository().findById(3L));

        System.out.println("\nInsertar un departamento");
        System.out.println("-------------------------------");
        Departamento dept = new Departamento("Information");
        manager.getDepartamentoRepository().save(dept);
        manager.getDepartamentoRepository().findAll().forEach(System.out::println);

        System.out.println("\nMostrar solo una");
        System.out.println("-------------------------------");
        Departamento res = manager.getDepartamentoRepository().findByKey("nombre", dept.getNombre());
        System.out.println(res);

        System.out.println("\nActualizar un departamento");
        System.out.println("-------------------------------");
        res.setNombre("AAAAAA");
        manager.getDepartamentoRepository().update(res);
        manager.getDepartamentoRepository().findAll().forEach(System.out::println);

        System.out.println("\nBorrar un departamento");
        System.out.println("-------------------------------");
        manager.getDepartamentoRepository().deleteById(res);
        manager.getDepartamentoRepository().findAll().forEach(System.out::println);

        //manager.getEmpleadoRepository().findAll().forEach(System.out::println);
    }
}
