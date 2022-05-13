package com.company.models;

public class MathSolution {
    private int id;
    private int operand1;
    private int operand2;
    private String operation;
    private int answer;


    public MathSolution(int id, int operand1, int operand2, String operation, int answer) {
        this.id = id;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int add(int operand1, int operand2) {

        return operand1 + operand2;
    }

    public int subtract(int operand1, int operand2) {

        return operand1 - operand2;
    }

    public int multiply(int operand1, int b) {
        return operand1 * operand2;
    }

    public int divide(int operand1, int operand2) {

        return operand1 / operand2;
    }

}
