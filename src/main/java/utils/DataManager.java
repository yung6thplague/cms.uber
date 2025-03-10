package utils;

import models.Filme;

import java.util.List;

public class DataManager {
    public static List<Filme> getFilmes() {
        return List.of(
                new Filme(1, "Donnie Darko", "Um adolescente problemático tem visões de um coelho gigante que o influencia a cometer crimes enquanto prevê o fim do mundo.", "darko.jpg", 113, "Ficção Científica/Thriller"),
                new Filme(2, "Brokeback Mountain", "Dois vaqueiros desenvolvem um relacionamento intenso e secreto ao longo de várias décadas, enfrentando desafios e preconceitos.", "brokeback.jpg", 134, "Drama/Romance"),
                new Filme(3, "Parasite", "Uma família pobre elabora um plano para se infiltrar na vida de uma família rica, mas logo a situação sai de controle.", "parasite.jpg", 132, "Drama/Thriller"),
                new Filme(4, "Memories of Murder", "Dois detetives tentam capturar um assassino em série na Coreia do Sul dos anos 80, em um dos casos mais famosos da história criminal do país.", "murder.jpg", 132, "Crime/Thriller"),
                new Filme(5, "The Brutalist", "Um arquiteto e sua esposa enfrentam desafios ao emigrar para os EUA, enquanto seu trabalho revolucionário gera conflitos inesperados.", "brutalist.jpg", 215, "Drama"),
                // Novos filmes adicionados
                new Filme(6, "Oppenheimer", "A história do criador da bomba atômica e sua luta moral após sua invenção.", "oppenheimer.jpg", 180, "Drama/Histórico"),
                new Filme(7, "Dune: Parte Dois", "Paul Atreides une forças com os Fremen para vingar sua família e cumprir seu destino.", "dune2.jpg", 165, "Ficção Científica/Aventura"),
                new Filme(8, "Poor Things", "Uma jovem ressuscitada por um cientista embarca em uma jornada para explorar o mundo e sua liberdade.", "poorthings.jpg", 141, "Fantasia/Comédia"),
                new Filme(9, "The Holdovers", "Um professor rabugento é obrigado a passar as férias de Natal com um aluno rebelde e um cozinheiro da escola.", "holdovers.jpg", 133, "Comédia/Drama"),
                new Filme(10, "Killers of the Flower Moon", "Investigação dos assassinatos misteriosos de membros da tribo Osage nos anos 1920.", "killers.jpg", 206, "Crime/Drama/Histórico"),
                new Filme(11, "Maestro", "Um retrato da vida e obra do maestro Leonard Bernstein, explorando sua genialidade e desafios pessoais.", "maestro.jpg", 129, "Biografia/Drama"),
                new Filme(12, "The Boy and the Heron", "Um menino descobre um mundo mágico enquanto lida com a perda da mãe e mudanças na sua vida.", "boyheron.jpg", 124, "Animação/Fantasia"),
                new Filme(13, "Saltburn", "Um jovem universitário entra na vida luxuosa de um colega aristocrata, descobrindo segredos obscuros.", "saltburn.jpg", 131, "Thriller/Drama"),
                new Filme(14, "Past Lives", "Dois amigos de infância se reencontram anos depois e refletem sobre os caminhos que suas vidas tomaram.", "pastlives.jpg", 105, "Romance/Drama"),
                new Filme(15, "Beau is Afraid", "Um homem neurótico embarca em uma jornada surreal e aterrorizante para visitar sua mãe.", "beau.jpg", 179, "Terror/Comédia")

        );
    }

}
