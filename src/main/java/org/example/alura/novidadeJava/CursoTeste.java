package org.example.alura.novidadeJava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CursoTeste {

    public static void main(String[] args) {

        List<ExemploCurso> cursos = new ArrayList<>();
        ExemploCurso java = new ExemploCurso("Java", 22);
        ExemploCurso kotlin = new ExemploCurso("kotlin", 2);
        ExemploCurso go = new ExemploCurso("go", 60);
        ExemploCurso python = new ExemploCurso("python", 26);
        ExemploCurso TS = new ExemploCurso("TS", 414);
        ExemploCurso c = new ExemploCurso("c", 101);

        cursos.add(java);
        cursos.add(kotlin);
        cursos.add(go);
        cursos.add(c);
        cursos.add(TS);
        cursos.add(python);

        int sum = cursos.stream().filter(course -> course.getQtdAlunos() >= 100)
                .mapToInt(ExemploCurso::getQtdAlunos).sum();

        System.out.println(sum);


//        cursos.sort(Comparator.comparing(ExemploCurso::getQtdAlunos));
//        int sum = cursos.stream().mapToInt(ExemploCurso::getQtdAlunos).filter(countAlun -> countAlun > 100)
//                .sum();
//
//        Optional<ExemploCurso> first = cursos.stream().filter(course -> course.getQtdAlunos() >= 100).findAny();
//
//      first.ifPresent(couseEncontrado -> System.out.println(couseEncontrado.getNomeCurso()));

//        Map<Object, Object> testes = cursos.stream().filter(couse -> couse.getQtdAlunos() >= 100)
//                .collect(Collectors.toMap(ExemploCurso::getNomeCurso, ExemploCurso::getQtdAlunos));
//
//        System.out.println(testes);




    }
}