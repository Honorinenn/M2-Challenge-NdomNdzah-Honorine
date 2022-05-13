package com.company.controllers;


import com.company.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MathSolutionController {

    private static int mathId = 1;

    private static List<MathSolution> solution = new ArrayList<>(Arrays.asList(
      new MathSolution (mathId++, 9, 7, "add", 16),
      new MathSolution(mathId++, 10, 8, "subtract", 2 ),
      new MathSolution (mathId++, 8, 5, "multiply", 40),
      new MathSolution(mathId++, 100, 5, "divide", 20 )
    ));

    @RequestMapping(value="/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution addMathSolution(@RequestBody MathSolution mathSolution) {

        mathSolution.add(mathSolution.getOperand1(), mathSolution.getOperand2());
        solution.add(mathSolution);
        return mathSolution;
    }

    @RequestMapping(value="/subtract", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution subtractMathSolution(@RequestBody MathSolution mathSolution) {

        mathSolution.subtract(mathSolution.getOperand1(), mathSolution.getOperand2());
        solution.add(mathSolution);
        return mathSolution;
    }

    @RequestMapping(value="/multiply", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution multiplyMathSolution(@RequestBody MathSolution mathSolution) {

        mathSolution.multiply(mathSolution.getOperand1(), mathSolution.getOperand2());
        solution.add(mathSolution);
        return mathSolution;
    }

    @RequestMapping(value="/divide", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution divideMathSolution(@RequestBody MathSolution mathSolution) {

        mathSolution.divide(mathSolution.getOperand1(), mathSolution.getOperand2());
        solution.add(mathSolution);
        return mathSolution;
    }
    

}
