package br.com.matheussantos;

import br.com.matheussantos.service.JobService;

public class Application {
    public static void main(String[] args) {
        JobService service = new JobService();

        service.execute();
    }
}
