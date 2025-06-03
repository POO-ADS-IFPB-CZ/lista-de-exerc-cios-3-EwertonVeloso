Questões teóricas da lista de exercícios - POO

**4. Explique a diferença entre um array de tipos primitivos (int[], double[]) e um array de objetos (Aluno[], Produto[]) em Java.**

**a) Como a memória é alocada em cada caso?**

**b) Quais cuidados devem ser tomados ao acessar elementos de um array de objetos?**

R:

  Arrays de tipos primitivos como int e double armazenam valores diretamente na memória, onde cada posição do array contém um dado. Enquanto arrays de objetos armazenam um ponteiro para o objeto criado.

a -) Para tipos primitivos, a memória é alocada em um bloco contínuo de memória. Já para os objetos, a memória é preenchida com null por padrão, sendo alocada somente quando o objeto for instanciado para cada posição.

b-) É uma boa prática verificar se um objeto é nulo antes de acessá-lo, além de inicializá-lo antes do uso, pois a verificação de uma posição do array pode retornar um valor nulo.


