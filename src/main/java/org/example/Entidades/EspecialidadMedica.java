package org.example.Entidades;

import lombok.*;

@AllArgsConstructor
public enum EspecialidadMedica {
    CARDIOLOGIA("Cardiología"),
    NEUROLOGIA("Neurología"),
    PEDIATRIA("Pediatría"),
    TRAUMATOLOGIA("Traumatología"),
    GINECOLOGIA("Ginecología"),
    UROLOGIA("Urología"),
    OFTALMOLOGIA("Oftalmología"),
    DERMATOLOGIA("Dermatología"),
    PSIQUIATRIA("Psiquiatria"),
    MEDICINA_GENERAL("Medicina General"),
    CIRUGIA_GENERAL("Cirugía General"),
    ANESTESIOLOGIA("Anestesiologia");
    private final String descripcion;

    public String getDescripcion() {
        return descripcion;
    }
} //
