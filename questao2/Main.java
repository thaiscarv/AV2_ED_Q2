package br.com.questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AVLTree arv = new  AVLTree();
        AVLTree arvore1 = new AVLTree();
        AVLTree.Node root = null;

        int[] vetor = {50, 13, 5, 17 , 9, 8, 10, 12, 55, 70};
        int menu=0;


        do{
            System.out.println("<1>Inserir Elemento:" +
                    "\n" +
                    "<2>Excluir Elemento:" +
                    "\n" +
                    "<3>Pre-ordem:" +
                    "\n" +
                    "<4>Sair"
            );
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    for (int i = 0; i < vetor.length; i++) {
                        root = arvore1.insert(root, vetor[i]);
                        arvore1.print(root);
                    }
                    break;
                case 2:
                    System.out.println("Digite um número:");
                    int  num = scan.nextInt();
                    arvore1.deleteNode(root, num);
                    break;
                case 3:
                    arvore1.preOrder(root);
                    break;
                case 4:
                    System.out.println("Usuário deslogado com sucesso");
                    break;
                default:
                    System.out.println("Comando Inválido");
            }

        }while(menu!=4);


    }
}

