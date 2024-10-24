/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Task;

/**
 *
 * @author a
 */
class ProgrammingLanguage implements Language {
    private final String name;

public ProgrammingLanguage(String name) {
        this.name = name;
    }
    @Override
 public String getName() {
        return this.name;
 }
}



