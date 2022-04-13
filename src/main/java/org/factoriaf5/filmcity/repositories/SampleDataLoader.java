package org.factoriaf5.filmcity.repositories;

import org.factoriaf5.filmcity.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private final MovieRepository movieRepository;

    @Autowired
    public SampleDataLoader(MovieRepository movieRepository){

        this.movieRepository = movieRepository;
    }

    @PostConstruct
    public void addSampleMovies() {
        if (movieRepository.findAll().isEmpty()) {
            List<Movie> movies = List.of(
                    new Movie("Sonic 2: La Película",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/sJiHVM0A3OXDVxl4Z6a7ihMPHfm.jpg",
                            "Jeff Fowler",
                            2022,
                            "Después de establecerse en Green Hills, Sonic se muere por demostrar que tiene madera de auténtico héroe, pero Robotnik regresa con nuevo compañero Knuckles, en busca de una esmeralda que tiene el poder de destruir civilizaciones, pero Sonic no esta solo lo ayudara Tails.",null,false,0),
                    new Movie("Ratatouille",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/npHNjldbeTHdKKw28bJKs7lzqzj.jpg",
                            "Brad Bird",
                            2007,
                            "Remy, a resident of Paris, appreciates good food and has quite a sophisticated palate. He would love to become a chef so he can create and enjoy culinary masterpieces to his heart's delight. The only problem is, Remy is a rat.",null,false,0),
                    new Movie("Encanto",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/d0ezQ1Jz0lpNsX1skEmIvqRL7mN.jpg",
                            "Byron Howard",
                            2021,
                            "Los Madrigal son una familia extraordinaria que vive en una casa mágica de un pueblo vibrante en las montañas de Colombia, escondidas en un 'Encanto'. La magia ha bendecido a cada niño de la familia con un don único, desde la superfuerza hasta el poder de sanar.",null,false,0
                    ),
                    new Movie("El bebé jefazo: Negocios de familia",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hvO2pc9X7kt7HZr5liSlk2MQA0Z.jpg",
                            "Marla Frazee",
                            2021,
                            "Los hermanos Templeton se han convertido en adultos y se han alejado el uno del otro, pero un nuevo jefe bebé con un enfoque de vanguardia está a punto de unirlos nuevamente e inspirar un nuevo negocio familiar.",null,false,0
                    ),
                    new Movie("La patrulla canina: La película",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fOYt5TfJKHHz0hFY37kSXKvEdf7.jpg",
                            "Bob Barlen",
                            2021,
                            "La patrulla canina está en racha. Cuando Humdinger, su mayor rival, se convierte en alcalde de la cercana Ciudad Aventura y empieza a causar estragos, Ryder y los heroicos cachorros se ponen en marcha para enfrentarse a este nuevo desafío.",null,false,0
                    ),
                    new Movie("Los Increíbles 2",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iNIKq8r155eRFlsoaxgfRYs71qY.jpg",
                            "Brad Bird",
                            2018,
                            "Helen tiene que liderar una campaña para que los superhéroes regresen, mientras Bob vive su vida 'normal' con Violet, Dash y el bebé Jack-Jack —cuyos superpoderes descubriremos—. ",null,false,0
                    ),
                    new Movie("Shrek 2",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/knRt4E8KyfwEv0SVu9LsLvD28IQ.jpg",
                            "Kelly Asbury",
                            2004,
                            "Cuando Shrek y la princesa Fiona regresan de su luna de miel, los padres de ella los invitan a visitar el reino de Muy Muy Lejano para celebrar la boda. Para Shrek, al que nunca abandona su fiel amigo Asno, esto constituye un gran problema. Los padres de Fiona, por su parte, no esperaban que su yerno tuviera un aspecto semejante y, mucho menos, que su hija hubiera cambiado tanto.",null,false,0
                    ),
                    new Movie("Monstruos, S.A.",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jTE3BLVCpYaR71L2U8SHV22HvEr.jpg",
                            "Pete Docter",
                            2001,
                            "Monsters Inc. es la mayor empresa de miedo del mundo, y James P. Sullivan es uno de sus mejores empleados. Asustar a los niños no es un trabajo fácil, ya que todos creen que los niños son tóxicos y no pueden tener contacto con ellos. Pero un día una niña se cuela sin querer en la empresa, provocando el caos.",null,false,0
                    ),
                    new Movie("El rey león",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/b0MxU37dNmMwKtoPVYPKOZSIrIn.jpg",
                            "Roger Allers",
                            1994,
                            "La sabana africana es el escenario en el que tienen lugar las aventuras de Simba, un pequeño león que es el heredero del trono. Sin embargo, se ve forzado a exiliarse al ser injustamente acusado de la muerte de su padre. Durante su destierro, hará buenas amistades y, finalmente, regresará para recuperar lo que legítimamente le corresponde.",null,false,0
                    ),
                    new Movie("Toy Story",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/GdMDcacJra4ZmDaBIRASIpzjmU.jpg",
                            "John Lasseter",
                            1994,
                            "Los juguetes de Andy, un niño de seis años, temen que haya llegado su hora y que un nuevo regalo de cumpleaños les sustituya en el corazón de su dueño. Woody, un vaquero que ha sido hasta ahora el juguete favorito de Andy, trata de tranquilizarlos hasta que aparece Buzz Lightyear, un héroe espacial dotado de todo tipo de avances tecnológicos.",null,false,0
                    ),
                    new Movie("Ice Age: La edad de hielo",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9rpdhn7p7mDZW2rUXsINf9c6sR5.jpg",
                            "Chris Wedge",
                            2002,
                            "Hace muchos, muchos años, tantos como 20.000, una pequeña ardirata de nombre Scrat quería esconder una bellota en el hielo. Pero lo que hace es provocar una semicatástrofe que provoca que todos los animales migren hacia el sur, hacia tierras más cálidas. Bueno, lo que se dice todos, todos, no.",null,false,0
                    ),
                    new Movie("Buscando a Nemo",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jPhak722pNGxQIXSEfeWIUqBrO5.jpg",
                            "Andrew Stanton",
                            2003,
                            "Nemo, un pececillo, hijo único muy querido y protegido por su padre, ha sido capturado en un arrecife australiano y ahora vive en una pecera en la oficina de un dentista de Sidney. El tímido padre de Nemo se embarcará en una peligrosa aventura para rescatar a su hijo. Pero Nemo y sus nuevos amigos tienen también un astuto plan para escapar de la pecera y volver al mar.",null,false,0
                    )
                    // Añadir aqui todas las pelis del catálogo!!
            );

            movieRepository.saveAll(movies);
        }
    }
}