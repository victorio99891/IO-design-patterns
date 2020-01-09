package pl.ioii.designpatterns.factory;

import pl.ioii.designpatterns.factory.model.Pentagon;

public class PentagonFactory implements AbstractFactory<Pentagon> {
    @Override
    public Pentagon create() {
        return new Pentagon();
    }
}
