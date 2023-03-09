package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    public String welcomeMathMsg() {
        return "Benvenuto";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation divisionInfo() {
        String[] prop = {"Anti-commutativity", "Non-associativity"};
        return new ArithmeticOperation("division", 2, "dividendo / divisore =  risultato", prop);

    }

    @GetMapping("/multiplication")
    public int multipicationInfo(@RequestParam(required = true) int operand1, @RequestParam(required = true) int operand2) {

        return operand1 * operand2;


    }

    @GetMapping("/square/{n}")
    public double squareInfo(@PathVariable() int n) {
        return n * n;
    }


}
